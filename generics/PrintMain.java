package generics;

import java.util.ArrayList;

public class PrintMain {
    public static void main ( String[] args ) {

        AnyPrinter <Integer> any1 = new AnyPrinter<>(25);
        any1.printItOut();
        AnyPrinter <String> any2 = new AnyPrinter<>("Franklin");
        any2.printItOut();
        AnyPrinter <Double> any3 = new AnyPrinter<>(100000.0);
        any3.printItOut();

        shout( 25 );
    }

    public static <T extends Integer> T shout( T someThing ) {
        System.out.println("Printing something : " + someThing);
        return someThing;
    }
}
