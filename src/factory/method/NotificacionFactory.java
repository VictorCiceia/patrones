package factory.method;

public class NotificacionFactory {

    public static final String SMS = "SMS";
    public static final String APP = "APP";
    public static final String EMAIL = "EMAIL";

    public Notificacion crearNotificacion(String tipo) {
        if(tipo.equalsIgnoreCase(SMS)){
            return new SMSNotificacion();
        }else if(tipo.equalsIgnoreCase(APP)){
            return new AppNotificacion();
        }else if(tipo.equalsIgnoreCase(EMAIL)){
            return new EmailNotificacion();
        }
        throw new IllegalArgumentException("El tipo no corresponde a uno conocido");
    }

}
