import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int round = 0;
        int sum = 0;
        int count = 0;
        boolean flag = true;
        while (flag){
            boolean isInt = scanner.hasNextInt();
            if (isInt){
                number = scanner.nextInt();
                count++;
                sum += number;
                round = (Math.round( (float) sum / (float) count));
            } else{
                flag = false;
            } scanner.nextLine();
        } System.out.println("SUM = " + sum + " AVG = " + round);
    }
}
