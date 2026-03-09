package Teoria.Curso_Programacion_POO.Class.POO.Valores_Iniciales;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        User user1 = new User();

        user.name = "Kevin";
        user1.name = "Timaran";

        System.out.println(user.name + " this is ID: " + user.id);
        System.out.println(user1.name + " this is ID: " + user1.id);

    }
}
