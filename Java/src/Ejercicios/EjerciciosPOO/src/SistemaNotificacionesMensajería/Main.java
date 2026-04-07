package SistemaNotificacionesMensajería;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args){
        Queue<String> bandeja = new LinkedList<>();

        bandeja.add("Hola bienvenido al sistema");
        bandeja.add("Tu codigo de verificacion es 4233");

        NotificadoFactory factory = new EmailFactory();

        factory.enviarSiguiente(bandeja); // Envía el primero
        factory.enviarSiguiente(bandeja); // Envía el segundo
        factory.enviarSiguiente(bandeja); // Dirá que está vacía




    }
}
