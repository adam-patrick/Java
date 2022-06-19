public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        number = Math.abs(number); // no negative numbers
        int numberCopy = number; // make a copy for while loop
        int reverse = 0, lastDigit = 0;
        while (numberCopy > 0) {
            lastDigit = numberCopy % 10; // get last number. example: get 1 from 1221
            reverse = reverse * 10 + lastDigit; // add last number to reverse variable
            numberCopy /= 10; // remove last number: example 1221 is now 122
        }
        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }

}
