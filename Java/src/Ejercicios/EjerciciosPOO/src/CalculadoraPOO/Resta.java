package CalculadoraPOO;

public class Resta implements OperacionStrategy {

    @Override
    public int ejecutar(int a, int b) {
        return a-b;
    }
}
