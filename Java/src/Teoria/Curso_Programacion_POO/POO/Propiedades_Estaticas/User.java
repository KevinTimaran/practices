package Teoria.Curso_Programacion_POO.POO.Propiedades_Estaticas;

class User {
    // El estatic nos sirve para crear valores estatico como guardar un usuario
    static String tableName= "User";

    double id = Math.random();
    String name;

    User (String name) {
        this.name = name;
    }

    public void saludar() {
        // When used the word reference this lo que estamos hacien es una referencia
        // A una instancia de la clase usuario
        System.out.println("Hi, word. My name is "  + tableName);
    }


}