package Teoria.Curso_Programacion_POO.Teoria.Abstractas;

public class Circulo extends Figura {
    private double radio;

    public Circulo() {
    }


    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public double calcularFigura() {
        double pi = 3.1416;
        double resultado = pi * radio * radio;
        return resultado;
    }
}
