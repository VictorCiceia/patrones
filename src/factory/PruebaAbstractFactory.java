package factory;

import factory.abst.Email;
import factory.abst.NotificacionFactory;
import factory.abst.SMS;
import factory.abst.UrgenteNotificacionFactory;

public class PruebaAbstractFactory {

    public void prueba(){
        NotificacionFactory factory = new UrgenteNotificacionFactory();
        Email email = factory.crearEmail();
        SMS sms = factory.crearSMS();
        email.enviar();
        sms.enviar();
    }

}
