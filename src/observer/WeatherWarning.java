package observer;

public class WeatherWarning implements Observer{
    private int lastestTemperature;

    private final int umbral = 100;
    @Override
    public void update(int temperature) {
        lastestTemperature = temperature;
        if(lastestTemperature > umbral)
            System.out.println("Alerta >> la temperatura es: " + lastestTemperature);
    }
}
