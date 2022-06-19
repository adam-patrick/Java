public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        int temp = 0;
        if (number < 1) {
            return false;
        } else {
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    temp += i;
                }
            }
        }
        if (number == temp) {
            return true;
        } else {
            return false;
        }
    }
}
