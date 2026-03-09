package Teoria.POO.Metodo_Constructor;

class User {
    double id = Math.random();
    String name;

    // Metodo Constructor
    User (String name) {
        this.name = name;

    }

    public void saludar() {
        // When used the word reference this lo que estamos hacien es una referencia
        // A una instancia de la clase usuario
        System.out.println("Hi, word. My name is "  + this.name);
    }
}