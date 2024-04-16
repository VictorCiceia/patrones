package factory.method;

public class AppNotificacion implements Notificacion {

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje por la App");
        System.out.println(mensaje);
    }
}
