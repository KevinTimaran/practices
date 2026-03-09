package Teoria.Curso_Programacion_POO.Teoria.Class;

public class Mian {
    public static void main(String[] args) {
        Class_Constructor student1= new Class_Constructor(3, "Kevin", "Buesaquillo");
        Class_Constructor student2= new Class_Constructor();

        System.out.println("The ID of the student is " + student1.getId());
        System.out.println("The name of the student is " + student1.getName());
        System.out.println("The surname of the student is " + student1.getSurname());

        student2.setId(2);
        student2.setName("David");
        student2.setSurname("Santiago");

        System.out.println("----------------------------------------------------------");
        System.out.println("The ID of the student is " + student2.getId());
        System.out.println("The name of the student is " + student2.getName());
        System.out.println("The surname of the student is " + student2.getSurname());

        System.out.println("-----------------------------------------------------------");
        //We're going to use the set method
        student1.setId(433);
        System.out.println("The ID of the student is " + student1.getId());
        System.out.println("The name of the student is " + student1.getName());
        System.out.println("The surname of the student is " + student1.getSurname());

    }
}
