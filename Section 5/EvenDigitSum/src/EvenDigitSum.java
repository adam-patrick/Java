public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        int aNumber = 0;
        int evenNumbers = 0;
        if (number < 0){
            return -1;
        } else {
            while (number != 0) {
                aNumber = number % 10; // move last number to another variable
                number /= 10; // remove last digit from number
                if (aNumber % 2 == 0) { // check if moved number is even
                    evenNumbers += aNumber; // if it is, add it third variable until 1st number is gone aka 0
                }
            }
        }
        return evenNumbers;
    }
}
