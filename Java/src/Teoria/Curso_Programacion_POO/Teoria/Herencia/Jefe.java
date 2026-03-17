package Teoria.Curso_Programacion_POO.Teoria.Herencia;


public class Jefe extends Persona{
    int id_jefe;
    String departamento_jefe;


    public Jefe(String departamento_jefe, int id_jefe) {
        this.departamento_jefe = departamento_jefe;
        this.id_jefe = id_jefe;
    }

    public Jefe(String apellido, int cc, String email, int id, String nombre, int telefono, String departamento_jefe, int id_jefe) {
        super(id, cc, email, apellido, nombre, telefono);
        this.departamento_jefe = departamento_jefe;
        this.id_jefe = id_jefe;
    }



    public Jefe() {
    }

    public String getDepartamento_jefe() {
        return departamento_jefe;
    }

    public void setDepartamento_jefe(String departamento_jefe) {
        this.departamento_jefe = departamento_jefe;
    }

    public int getId_jefe() {
        return id_jefe;
    }

    public void setId_jefe(int id_jefe) {
        this.id_jefe = id_jefe;
    }
}
