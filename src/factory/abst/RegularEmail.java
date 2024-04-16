package factory.abst;

public class RegularEmail implements Email {

    @Override
    public void enviar() {
        System.out.println("Se envia un EMAIL REGULAR");
    }
}
