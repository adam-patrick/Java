import java.util.Scanner;

public class Main {

    public static int[] readIntegers(int count){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        System.out.println("Enter the integers for the array: \r");
        for (int i = 0; i < array.length; i++){
            int number =  scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            int value = array[i];

            if (value < min){
                min = value;
            }
        }
        return min;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: \r");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int minimum = findMin(returnedArray);
        System.out.println(minimum);
    }
}
