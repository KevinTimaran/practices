package SistemaNotificacionesMensajería;

import java.util.Queue;
import java.util.Stack;

public abstract class NotificadoFactory {

    //Factory method
    protected abstract Mensaje crearMensaje ();


    public void enviarSiguiente(Queue<String> cola) {
        // 1. Validamos la lógica: ¿Hay algo en la cola?
        if (cola.isEmpty()){
            System.out.println("No hay mensajes pendientes por enviar.");
            return;
        }
        // 2. Sacamos el primer mensaje (Lógica FIFO: First In, First Out)
        String contenido = cola.poll();

        // 3.tiene un metodo enviar().
        Mensaje miMensaje =  crearMensaje();
        miMensaje.enviar(contenido);







    }

}
