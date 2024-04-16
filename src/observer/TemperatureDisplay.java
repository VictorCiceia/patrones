package observer;

public class TemperatureDisplay implements Observer{

    private int lastestTemperature;
    @Override
    public void update(int temperature) {
        lastestTemperature = temperature;
        System.out.println("Última temperatura: " + lastestTemperature);
    }
}
