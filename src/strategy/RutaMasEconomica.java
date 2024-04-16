package strategy;

public class RutaMasEconomica implements RutaStrategy {
    public String calcularRuta(String puntoA, String puntoB) {
        return "Ruta más economica entre " + puntoA + " y " + puntoB;
    }
}
