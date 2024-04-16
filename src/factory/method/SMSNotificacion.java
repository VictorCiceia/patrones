package factory.method;

public class SMSNotificacion implements Notificacion {

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje por SMS");
        System.out.println(mensaje);
    }
}
