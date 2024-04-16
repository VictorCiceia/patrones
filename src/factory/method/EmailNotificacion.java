package factory.method;

public class EmailNotificacion implements Notificacion {

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje por Email");
        System.out.println(mensaje);
    }
}
