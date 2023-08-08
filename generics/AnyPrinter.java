package generics;

public class AnyPrinter <T> {

    T thingToPrint;

    public AnyPrinter(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void printItOut(){
        System.out.println("I am printing out : " +  thingToPrint);
    }
}
