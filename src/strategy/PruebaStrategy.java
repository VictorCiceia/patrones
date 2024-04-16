package strategy;

public class PruebaStrategy {

    public void prueba(){

        NavegadorGPS gps = new NavegadorGPS(new RutaMasRapida());
        gps.calcularRuta("Punto A", "Punto B");

        // Cambiar a otra estrategia
        gps.setRutaStrategy(new RutaMasCorta());
        gps.calcularRuta("Punto A", "Punto B");

        // Cambiar a ruta
        gps.setRutaStrategy(new RutaTuristica());
        gps.calcularRuta("Punto A", "Punto B");

    }
}
