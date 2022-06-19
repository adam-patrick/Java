public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c){
        int a2 = a % 10;
        int b2 = b % 10;
        int c2 = c % 10;
        if (a < 10 || a > 1000 || b < 10 || b > 1000 || c < 10 || c > 1000 || (a2 != b2 && b2 != c2 && a2 != c2)){
            return false;
        } else{
            return true;
        }
    }

    public static boolean isValid(int d){
        if (d < 10 || d > 1000 ){
            return false;
        } else {
            return true;
        }
    }
}
