public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b){
        int a2 = 0;
        int b2 = 0;
        if (a < 10 || a > 99 || b < 10 || b > 99){
            return false;
        } else{
            a2 = a % 10;
            b2 = b % 10;
            a /= 10;
            b /= 10;
            }
        if (a == b || a2 == b2 || a == b2 || a2 == b) {
            return true;
        } else {
            return false;
        }
    }
}
