package CalculadoraPOO;

import java.util.Stack;

public class Calculadora {
    private Stack <Integer> historial= new Stack<>();
    private OperacionStrategy estrategia;

    public void setEstrategia(OperacionStrategy estrategia){
        this.estrategia = estrategia;
    }

    public void calcular(int a, int b){
        if (estrategia == null){
            System.out.println("Error: Selecciona una operacion primero.");
            return;
        }
        int resultado = estrategia.ejecutar(a,b);
        historial.push(resultado); // Guardar los resultados en la pila
        System.out.println("Resultado: "+ resultado);
    }

    public void deshacer(){
        if (!historial.isEmpty()){
            int eliminado = historial.pop();
            System.out.println("Deshaciendo... se elimino el: " + eliminado);

            if (!historial.isEmpty()) {
                System.out.println("Nuevo resultado actual: " + historial.peek());
        }else {
                System.out.println("El historial ahora esta vacio.");
            }
        }else {
            System.out.println("No hay nada que deshacer.");
        }

    }






}
