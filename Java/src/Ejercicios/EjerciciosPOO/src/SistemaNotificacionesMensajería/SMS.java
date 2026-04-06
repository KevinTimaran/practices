package SistemaNotificacionesMensajería;

public class SMS implements Mensaje{
    @Override
    public void enviar(String contenido) {
        System.out.println("Este mensaje fue enviado por SMS" + contenido);
    }
}
