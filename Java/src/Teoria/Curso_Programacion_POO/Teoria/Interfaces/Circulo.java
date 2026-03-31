package Teoria.Curso_Programacion_POO.Teoria.Interfaces;

public class Circulo implements Figura, Dibujable, Rotable {
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }


    @Override
    public double calcularFigura() {
        double pi = 3.1416;
        double resultado = pi * radio * radio;
        return resultado;
    }

    @Override
    public double calcularArea() {
        return 0;
    }


    @Override
    public void dibujar() {
        System.out.println("HI word");

    }

    @Override
    public void rotar() {
        System.out.println("HI, I am a circle and I can rotate");
    }
}
