package CalculadoraPOO;

import CalculadoraPOO.Calculadora;
import CalculadoraPOO.Multiplicacion;
import CalculadoraPOO.Suma;

public class Main {
    public static void main(String[] args) {
        Calculadora miCalcu = new Calculadora();

        // 1. Sumamos
        miCalcu.setEstrategia(new Suma());
        miCalcu.calcular(10, 5); // 15

        // 2. Multiplicamos
        miCalcu.setEstrategia(new Multiplicacion());
        miCalcu.calcular(2, 4);  // 8

        // 3. Probamos el "Ctrl+Z" (Deshacer)
        System.out.println("--- Probando historial ---");
        miCalcu.deshacer(); // Debería quitar el 8 y mostrar el 15
        miCalcu.deshacer(); // Debería dejar vacía la pila
        miCalcu.deshacer(); // Debería decir que no hay nada más
    }
}