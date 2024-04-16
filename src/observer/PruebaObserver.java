package observer;

public class PruebaObserver {

    public void prueba(){
        final WeatherStation station = new WeatherStation();

        WeatherWarning warning = new WeatherWarning();
        TemperatureDisplay display = new TemperatureDisplay();

        station.addObserver(warning);
        station.addObserver(display);

        station.setTemperature(20);
        station.setTemperature(105);

    }

}
