package Teoria.Curso_Programacion_POO.Teoria.Encapsulamiento;

public class Main {
    public static void main(String[] args) {

        Alumno alumno = new Alumno();
        Alumno alumno2 = new Alumno(323, "Kevin", "Buesaquillo");


        System.out.println("id: " + alumno2.getId());
        System.out.println("Nombre: " + alumno2.getNombre());
        System.out.println("Apellido: " + alumno2.getApellido());

    }
}
