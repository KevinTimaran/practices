package Teoria.Curso_Programacion_POO.Teoria.Herencia;
import Teoria.Curso_Programacion_POO.Teoria.Herencia.Persona;

public class Consultor extends Persona {
    String combre_consultora;
    int num_cconsultora;

    public Consultor() {}

    public Consultor(int id, int cc, String nombre, String apellido, String email, int telefono, String combre_consultora, int num_cconsultora) {
        super(id, cc, nombre, apellido, email, telefono);
        this.combre_consultora = combre_consultora;
        this.num_cconsultora = num_cconsultora;
    }

    public String getCombre_consultora() {
        return combre_consultora;
    }

    public void setCombre_consultora(String combre_consultora) {
        this.combre_consultora = combre_consultora;
    }

    public int getNum_cconsultora() {
        return num_cconsultora;
    }

    public void setNum_cconsultora(int num_cconsultora) {
        this.num_cconsultora = num_cconsultora;
    }
}
