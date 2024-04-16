package strategy;

public class RutaMasCorta implements RutaStrategy {
    public String calcularRuta(String puntoA, String puntoB) {
        return "Ruta más corta entre " + puntoA + " y " + puntoB;
    }
}
