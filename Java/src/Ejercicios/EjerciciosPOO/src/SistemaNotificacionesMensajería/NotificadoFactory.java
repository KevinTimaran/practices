package SistemaNotificacionesMensajería;

public abstract class NotificadoFactory {

    //Factory method
    protected abstract Mensaje crearMensaje ();

    public void enviarSiguiente() {

    }

}
