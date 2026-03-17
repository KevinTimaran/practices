package Teoria.Curso_Programacion_POO.Teoria.Abstractas;

public abstract class Figura {

    protected double x;
    protected double y;

    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Figura() {
    }

    public abstract double calcularFigura();

}
