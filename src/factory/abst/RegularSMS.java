package factory.abst;

public class RegularSMS implements SMS {

    @Override
    public void enviar() {
        System.out.println("Se envia un SMS REGULAR");
    }

}
