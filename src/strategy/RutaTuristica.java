package strategy;

public class RutaTuristica implements RutaStrategy {
    public String calcularRuta(String puntoA, String puntoB) {
        return "Ruta más turistica entre " + puntoA + " y " + puntoB;
    }
}
