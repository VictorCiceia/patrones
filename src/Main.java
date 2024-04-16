import factory.PruebaAbstractFactory;
import factory.PruebaMethodFactory;

public class Main {
    public static void main(String[] args) {


        // SINGLETON
        Singleton s = new Singleton();
        s.prueba();


        // ABSTRACT FACTORY
        PruebaAbstractFactory abstractFactory = new PruebaAbstractFactory();
        abstractFactory.prueba();


        // METHOD FACTORY
        PruebaMethodFactory methodFactory = new PruebaMethodFactory();
        methodFactory.prueba();

    }
}