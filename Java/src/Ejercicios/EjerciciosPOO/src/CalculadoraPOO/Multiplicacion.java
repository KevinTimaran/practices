package CalculadoraPOO;

public class Multiplicacion implements OperacionStrategy {
    @Override
    public int ejecutar(int a, int b) {
        return a*b;
    }
}
