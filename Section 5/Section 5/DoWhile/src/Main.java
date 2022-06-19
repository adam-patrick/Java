public class Main {
    public static void main(String[] args){

        System.out.println("While Loop Intro");
        int count  = 0;
        while(count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("--------------------------------");

        System.out.println("For Loop version of While Loop");
        for (count = 1; count != 6; count++) {
            System.out.println("Count value is " + count);
        }

        System.out.println("--------------------------------");

        System.out.println("While Boolean Loop");
        count = 1;
        while(true){
            if(count == 6){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("--------------------------------");
        System.out.println("Do While Loop Intro");
        count = 6;
        do{
            System.out.println("Count value was " + count);
            count++;

            if (count > 100) {
                break;
            }

        } while(count!=6);

        System.out.println("--------------------------------");

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;  // if number is not even, return to beginning of loop
            }
            System.out.println("Even number " + number);
            evenNumbersFound += 1;
        }
        System.out.println("Total number of even numbers was " + evenNumbersFound + ".");
    }

    // Challenge
    public static boolean isEvenNumber(int number){
        if (number % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
