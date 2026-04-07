package SistemaNotificacionesMensajería;

public class EmailFactory extends NotificadoFactory{
    @Override
    protected Mensaje crearMensaje() {
        return new Email();
    }
}
