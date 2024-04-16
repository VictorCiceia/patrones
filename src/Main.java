import factory.PruebaAbstractFactory;
import factory.PruebaMethodFactory;
import observer.PruebaObserver;
import strategy.PruebaStrategy;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n\n------------------------     SINGLETON    ----------------------------------");
        // SINGLETON
        Singleton s = new Singleton();
        s.prueba();


        System.out.println("\n\n------------------------  ABSTRACT FACTORY ----------------------------------");
        // ABSTRACT FACTORY
        PruebaAbstractFactory abstractFactory = new PruebaAbstractFactory();
        abstractFactory.prueba();


        System.out.println("\n\n------------------------  METHOD FACTORY  ----------------------------------");
        // METHOD FACTORY
        PruebaMethodFactory methodFactory = new PruebaMethodFactory();
        methodFactory.prueba();


        System.out.println("\n\n------------------------      OBSERVER    ----------------------------------");
        // OBSERVER
        PruebaObserver observer = new PruebaObserver();
        observer.prueba();


        System.out.println("\n\n------------------------      STRATEGY    ----------------------------------");
        // STRATEGY
        PruebaStrategy strategy = new PruebaStrategy();
        strategy.prueba();




    }
}