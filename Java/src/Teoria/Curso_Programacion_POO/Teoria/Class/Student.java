package Teoria.Curso_Programacion_POO.Teoria.Class;
// Class
// Attributes
// Methods

public class Student {
    // This is the attributes
    int id;
    String name;
    String surname;

    //This is the methods
    public void mostrarNombre(){
        System.out.println("Hello, i am Kevin");
    }

    public void saberAprobado(double calificacion){
        if  (calificacion >= 0.8){
            System.out.println("Aprobado");
        } else {
            System.out.println("No aprobado");
        }
    }

}
