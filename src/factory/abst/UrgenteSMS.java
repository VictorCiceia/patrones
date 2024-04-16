package factory.abst;

public class UrgenteSMS  implements SMS {

    public void enviar() {
        System.out.println("Se envia un SMS URGENTE");
    }
}
