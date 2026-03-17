package Teoria.Curso_Programacion_POO.Teoria.Encapsulamiento;

public class Alumno {
    private int id;
    private String nombre;
    private String apellido;

    public Alumno(int id, String nombre, String apellido ) {
        this.apellido = apellido;
        this.id = id;
        this.nombre = nombre;
    }

    public Alumno() {}

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
