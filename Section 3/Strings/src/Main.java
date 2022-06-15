public class Main {

    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // basic String creation
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00a9 2019";
        System.out.println("myString is equal to " + myString);

        // appending to Strings
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);

        double doubleNumber = 120.47D;
        lastString = lastString + doubleNumber;
        System.out.println("lastString is equal to " + lastString);

        // Strings are immutable. They cannot be changed.
        // Instead, a new String is created, and the old one
        // is discarded.
        
    }
}
