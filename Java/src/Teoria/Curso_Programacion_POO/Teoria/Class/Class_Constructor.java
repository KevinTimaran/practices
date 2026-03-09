package Teoria.Curso_Programacion_POO.Teoria.Class;
// Class
// Attributes
// Method
// Method constructor
// Get and set: These methods come after the constructor method
public class Class_Constructor {
        // This is the attributes, this datas are  globals
        int id;
        String name;
        String surname;

    // Method constructor, these datas are locals
    public Class_Constructor(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }







    //This is the methods
        public void mostrarNombre(){
            System.out.println("Hello, i am Kevin");
        }
}
