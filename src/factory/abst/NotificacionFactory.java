package factory.abst;

public interface NotificacionFactory {

    Email crearEmail();
    SMS crearSMS();

}
