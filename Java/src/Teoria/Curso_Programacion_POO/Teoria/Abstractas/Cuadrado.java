package Teoria.Curso_Programacion_POO.Teoria.Abstractas;

public class Cuadrado extends Figura {

    private double lado;


    public Cuadrado(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado() {
    }

    @Override // This is Override and his meaning is of overwriting to methods
    public double calcularFigura() {
        double resultado = lado * lado;
        return resultado;
    }
}
