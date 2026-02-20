#include <iostream>
#include <stdexcept>
#include <chrono>
#include <cmath>

#include <GL/glew.h>
#include <GLFW/glfw3.h>
#include <glm/glm.hpp>
#include <functional>
#include <vector>

#ifndef M_PI
#define M_PI 3.14159265358979323846 // Sirve para definir PI 
#endif

using glm::vec2;
using Clock = std::chrono::high_resolution_clock; 



struct Engine {
    GLFWwindow* window = nullptr;
    int WIDTH = 800;
    int HEIGHT = 600;
    double deltaTime = 0.0;

    Engine() {
        if (!glfwInit()) {
            throw std::runtime_error("Failed to initialize GLFW");
        }

        // Request an OpenGL 2.1 compatibility context so fixed-function calls (glBegin, glOrtho, etc.) work
        glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 2);
        glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 1);

        window = glfwCreateWindow(WIDTH, HEIGHT, "Black Hole Simulation", NULL, NULL);
        if (!window) {
            glfwTerminate();
            throw std::runtime_error("Failed to create GLFW window");
        }

        glfwMakeContextCurrent(window);

        // Close on ESC
        glfwSetKeyCallback(window, [](GLFWwindow* w, int key, int sc, int action, int mods){
            if (key == GLFW_KEY_ESCAPE && action == GLFW_PRESS) glfwSetWindowShouldClose(w, GLFW_TRUE);
        });

        // Enable VSync
        glfwSwapInterval(1);

        // Initialize GLEW (after making context current)
        glewExperimental = GL_TRUE;
        if (glewInit() != GLEW_OK) {
            glfwDestroyWindow(window);
            glfwTerminate();
            throw std::runtime_error("Failed to initialize GLEW");
        }

        glViewport(0, 0, WIDTH, HEIGHT);

        // Setup simple orthographic projection so we can draw in pixel coordinates [0..WIDTH] x [0..HEIGHT]
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0, WIDTH, 0, HEIGHT, -1, 1);
        glMatrixMode(GL_MODELVIEW);
        glLoadIdentity();

        glEnable(GL_DEPTH_TEST);
    }

    ~Engine() {
        if (window) glfwDestroyWindow(window);
        glfwTerminate();
    }

    // Accept a draw callback so the caller can issue draw commands between clear and swap
    void run_one_frame(const std::function<void()> &draw_cb) {
        static auto last = Clock::now();
        auto now = Clock::now();
        deltaTime = std::chrono::duration<double>(now - last).count();
        last = now;

        glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

        if (draw_cb) draw_cb();

        glfwSwapBuffers(window);
        glfwPollEvents();
    }

    bool should_close() const {
        return glfwWindowShouldClose(window);
    }
};

// Para el agujero negro
struct BlackHole {
    vec2 position; // Posición en 2D (en coordenadas de ventana)
    float radius;  // radio en píxeles

    BlackHole(const vec2 &pos, float r) : position(pos), radius(r) {}

    void draw() const {
        // Dibuja un círculo lleno en coordenadas de ventana
        glColor3f(1.0f, 0.0f, 0.0f); // rojo
        glBegin(GL_TRIANGLE_FAN);
        glVertex2f(position.x, position.y); // centro
        const int segments = 64;
        for (int i = 0; i <= segments; ++i) {
            float angle = i * 2.0f * (float)M_PI / segments;
            float x = cosf(angle) * radius + position.x;
            float y = sinf(angle) * radius + position.y;
            glVertex2f(x, y);
        }
        glEnd();
    }
};

BlackHole SagA(vec2(0.0, 0.0), 8.54e36);

// Para los rayos de luz
struct Ray {
    // Cordenadas normales 
    double x, y;
    // Cordenadas polares
    double r; double phi;

    glm::vec2 vel; // velocidad en px/s
    std::vector<glm::vec2> trail; // cola persistente

    Ray(vec2 pos, vec2 dir) : x(pos.x), y(pos.y) {
        r = hypot(x, y);
        phi = atan2(y, x);
    }

    void draw() const {
        // dibujar cola persistente con degradado de alpha (tail -> head)
        if (!trail.empty()) {
            glEnable(GL_BLEND);
            glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
            glLineWidth(2.0f);
            size_t N = trail.size();
            glBegin(GL_LINE_STRIP);
            for (size_t i = 0; i < N; ++i) {
                float alpha = 0.05f + 0.95f * ((float)i / (float)(N - 1)); // tail dim, head bright
                // map alpha so head is bright
                glColor4f(1.0f, 1.0f, 0.0f, alpha);
                glVertex2f(trail[i].x, trail[i].y);
            }
            glEnd();
        }

        // núcleo: segmento corto brillante en la cabeza
        glm::vec2 pos((float)x, (float)y);
        glm::vec2 dir = glm::normalize(vel);
        const float len = 24.0f;
        glm::vec2 a = pos - dir * (len * 0.2f);
        glm::vec2 b = pos + dir * (len * 0.8f);

        glEnable(GL_BLEND);
        glBlendFunc(GL_SRC_ALPHA, GL_ONE);
        glLineWidth(3.0f);
        glBegin(GL_LINES);
        glColor4f(1.0f, 1.0f, 0.8f, 1.0f);
        glVertex2f(a.x, a.y);
        glColor4f(1.0f, 1.0f, 0.0f, 0.0f);
        glVertex2f(b.x, b.y);
        glEnd();

        // restore blending
        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
    }

    void step(double dt) {
        x += vel.x * dt;
        y += vel.y * dt;
        trail.emplace_back((float)x, (float)y);
        // limitar tamaño de trail para evitar crecimiento infinito
        const size_t maxTrail = 5000;
        if (trail.size() > maxTrail) trail.erase(trail.begin(), trail.begin() + (trail.size() - maxTrail));
    
    
    }
};

std::vector<Ray> rays;






int main() {
    try {
        Engine engine;

        // poblar rayos iniciales a lo largo del borde izquierdo (cada 20 px)
        for (float y = 0.0f; y <= engine.HEIGHT; y += 20.0f) {
            rays.emplace_back(glm::vec2(-50.0f, y), glm::vec2(1.0f, 0.0f), 220.0);
        }

        BlackHole hole(glm::vec2(engine.WIDTH / 2.0f, engine.HEIGHT / 2.0f), 80.0f);

        while (!engine.should_close()) {
            // actualizar posiciones y eliminar fuera de pantalla
            for (auto it = rays.begin(); it != rays.end();) {
                it->step(engine.deltaTime);
                if (it->x < -100.0 || it->x > engine.WIDTH + 100.0 || it->y < -100.0 || it->y > engine.HEIGHT + 100.0) {
                    it = rays.erase(it);
                } else {
                    ++it;
                }
            }

            engine.run_one_frame([&]() {
                for (const auto &ray : rays) ray.draw();
                hole.draw();
            });
        }
        return 0;
    } catch (const std::exception &e) {
        std::cerr << "Error: " << e.what() << std::endl;
        return 1;
    }
}