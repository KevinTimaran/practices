package SistemaNotificacionesMensajería;

public class Email implements Mensaje{
    @Override
    public void enviar(String contenido) {
        System.out.println("Este mensaje fue enviado por Email" + contenido);

    }
}
