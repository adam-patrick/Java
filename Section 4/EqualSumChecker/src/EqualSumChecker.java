public class EqualSumChecker {
    public static boolean hasEqualSum(int a, int b, int c) {
        int ab = a + b;
        if (ab == c) {
            return true;
        } else {
            return false;
        }
    }
}
