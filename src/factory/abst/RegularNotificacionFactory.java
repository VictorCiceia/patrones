package factory.abst;

public class RegularNotificacionFactory implements NotificacionFactory {

    public Email crearEmail() {
        return new RegularEmail();
    }

    public SMS crearSMS() {
        return new RegularSMS();
    }
}
