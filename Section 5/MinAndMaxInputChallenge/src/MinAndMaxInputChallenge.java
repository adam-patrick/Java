import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int userNumber = 0;
        int min = 0;
        int max = 0;

        while (flag){
            System.out.println("Enter a number: ");
            boolean nextInt = scanner.hasNextInt();
            if (nextInt){
                userNumber = scanner.nextInt();
                if (userNumber < min || min == 0){
                    min = userNumber;
                }
                if (userNumber > max || max == 0){
                    max = userNumber;
                }
            } else {
                System.out.println("Invalid Number");
                flag = false;
            }
        }
        System.out.println("Minimum number is " + min + " and Maximum number is " + max + ".");
        scanner.close();
    }
}
