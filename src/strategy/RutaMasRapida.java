package strategy;

public class RutaMasRapida implements RutaStrategy {
    public String calcularRuta(String puntoA, String puntoB) {
        return "Ruta más rápida entre " + puntoA + " y " + puntoB;
    }
}
