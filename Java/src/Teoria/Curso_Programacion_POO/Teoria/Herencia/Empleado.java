package Teoria.Curso_Programacion_POO.Teoria.Herencia;
import Teoria.Curso_Programacion_POO.Teoria.Herencia.Persona;

public class Empleado extends Persona {

    int num_legajo;
    String cargo;
    Double sueldo;

    public Empleado() {

    }

    public Empleado(int id, int cc, String nombre, String apellido,
                    String email, int telefono, String cargo,
                    int num_legajo, Double sueldo) {

        super(id, cc, nombre, apellido, email, telefono);
        this.cargo = cargo;
        this.num_legajo = num_legajo;
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNum_legajo() {
        return num_legajo;
    }

    public void setNum_legajo(int num_legajo) {
        this.num_legajo = num_legajo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
