
public class Singleton {

    public Singleton() {
    }

    public void prueba() {
        AppConfig servidor = AppConfig.getInstance();
        servidor.setServerUrl("http://miapi.com");
        //servidor.setPort(8080);
        System.out.println("URL del Servidor: " + servidor.getServerUrl());

        AppConfig servidorReserva = AppConfig.getInstance();
        System.out.println("URL del servidor reserva: " + servidorReserva.getServerUrl() + " puerto " + servidorReserva.getPort());

    }
}

class AppConfig {
    private static AppConfig instance;
    private String serverUrl;
    private int port;

    private AppConfig() {
        this.serverUrl = "";
        this.port = 8080;
    }

    public static synchronized AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
