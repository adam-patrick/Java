public class Main {
    public static void main(String[] args)
    {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5F / 3F; // floating point numbers are assumed by Java to be Doubles.
        double myDoubleValue = 5D / 3D;

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        //Challenge
        double poundexample = 5D;
        double kilogram = 0.45359237D;
        System.out.println("5 pounds is " + (poundexample * kilogram) + " kilograms");
        
        double pi = 3.1414927d;
        double anotherNumber = 3_000_000.4_467_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
