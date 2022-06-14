package Java_Masterclass;

public class Main {

    public static void main(String[] args) {

        int myValue = 1000;

        // int becomes highest possible value
        int myMinIntValue = Integer.MIN_VALUE;
        // int becomes lowest possible value
        int myMaxIntValue = Integer.MAX_VALUE;
        // prints out highest int value
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        // prints out lowest int value
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        // Overflow - int is pushed past maximum possible value, cycles around to lowest
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        // Underflow - int is pushed past minimum possible value, cycles around to highest
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        // Byte range is -128 to 127
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        // Short range is -32768 to 32767
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);


        long myLongValue = 100L; // for Long numbers, put an "L" after the number.

        // Long range is -9223372036854775808 to 9223372036854775807
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;
        System.out.println(bigShortLiteralValue);

        int myTotal = (myMinIntValue / 2 );

        // the #2 below is an int by default. It must be cast as a byte
        byte myNwwByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        // Challenge

        byte a = 10;
        short b = 20;
        int c = 50;
        long d = 50000L + 10L * (a + b + c);
        System.out.println("Challenge answer is: " + d);

        }
}
