package factory;

import factory.method.Notificacion;
import factory.method.NotificacionFactory;

public class PruebaMethodFactory {

    public void prueba(){
        NotificacionFactory factory = new NotificacionFactory();
        Notificacion sms = factory.crearNotificacion(NotificacionFactory.SMS);
        sms.enviarMensaje("SMS enviado");
        Notificacion email = factory.crearNotificacion(NotificacionFactory.EMAIL);
        email.enviarMensaje("EMAIL enviado");
    }
}
