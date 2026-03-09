package Teoria.Curso_Programacion_POO.POO.Propiedades_Estaticas;

public class Main {
    public static void main(String[] args) {
        User user = new User("Kevin");
        User user1 = new User("Timaran");

        user.saludar();
        user1.saludar();


        System.out.println(User.tableName);

    }
}
