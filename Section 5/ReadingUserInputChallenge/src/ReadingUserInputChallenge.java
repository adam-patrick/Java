import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number = 1;
        int count = 1;
        int userNumber = 0;
        boolean flag = true;

        while (flag){
            System.out.println("Enter # " + number + ": ");
            boolean intCheck = scanner.hasNextInt();
            if (intCheck){
                userNumber = scanner.nextInt();
                sum += userNumber;
                count++;
                number++;
                if (count > 10){
                    flag = false;
                }
            } else {
                System.out.println("Invalid Number");
            } scanner.nextLine(); // handle end of line (enter key). loop is unending otherwise.
        }
        System.out.print(sum);
        scanner.close();
    }
}
