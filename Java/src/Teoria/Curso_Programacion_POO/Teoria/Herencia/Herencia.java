package Teoria.Curso_Programacion_POO.Teoria.Herencia;

public class Herencia {
    public static void main(String[] args) {

        // We do flattening to the different methods whit Herencia
        Empleado empleado = new Empleado();
        empleado.getNombre();
        empleado.getCargo();

        Consultor consultora = new Consultor();
        consultora.getNombre();
        consultora.getCombre_consultora();

        //Now we will use the polimorfismo

        Persona verctor [] = new Persona[5];
        verctor [0] = new Persona();
        verctor [1] = new Empleado();
        verctor [2] = new Consultor();
        verctor [3] = new Jefe();

        Persona persona = new Persona();
        Consultor consultor = new Consultor();

        persona = consultor; // Upcasting, we can assign a child class to a parent
    }
}
