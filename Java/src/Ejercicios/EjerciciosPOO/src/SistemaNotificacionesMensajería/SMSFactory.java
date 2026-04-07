package SistemaNotificacionesMensajería;

public class SMSFactory  extends NotificadoFactory{

    @Override
    protected Mensaje crearMensaje() {
        return new SMS();
    }
}
