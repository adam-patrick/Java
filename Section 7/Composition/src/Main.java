public class Main {

    public static void main(String[] args){

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitior = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.4");

        PC thePC = new PC(theCase, theMonitior, motherboard);

        // getting a method from a subclass
        thePC.powerUp();
    }
}
