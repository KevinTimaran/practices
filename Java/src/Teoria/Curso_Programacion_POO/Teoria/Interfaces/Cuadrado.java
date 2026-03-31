package Teoria.Curso_Programacion_POO.Teoria.Interfaces;

public class Cuadrado implements Figura, Dibujable {
    private double lado;


    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado() {
    }


    @Override
    public double calcularFigura() {
        return 0;
    }

    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("HI, I am cuadrado and have sides four");
    }
}
