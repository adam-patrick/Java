public class For {
    public static void main(String[] args){
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        // for loops
        // for(init; termination; increment)
//        for (int i=0; i<5; i++) {
//            System.out.println("Loop "+ i + " hello!");
//        }
        for (int i = 2; i < 9; i++){
            System.out.println("10,000 at " + i + "% interest is " + String.format("%.2f", calculateInterest(10000, i)));
        }

        System.out.println("-------------------------------------");

        for (int i = 8; i >= 2; i--){
            System.out.println("10,000 at " + i + "% interest is " + String.format("%.2f", calculateInterest(10000, i)));
        }

        System.out.println("-------------------------------------");

        int count = 0;
        for(int i = 10; i < 50; i++){
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 3){
                    System.out.println("Exiting for loop...");
                    break;
                }
            }
        }
        System.out.println("-------------------------------------");

    }

    // Functions
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
