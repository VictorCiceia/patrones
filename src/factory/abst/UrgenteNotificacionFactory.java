package factory.abst;

public class UrgenteNotificacionFactory implements NotificacionFactory {

    public Email crearEmail() {
        return new UrgenteEmail();
    }

    public SMS crearSMS() {
        return new UrgenteSMS();
    }
}
