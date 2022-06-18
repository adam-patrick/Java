import java.util.Locale;

public class Main {
    public static void main(String[] args){

//        int value = 1;
//        if(value == 1){
//            System.out.println("Value was 1");
//        } else if (value == 2){
//            System.out.println("Value was 2");
//        } else{
//            System.out.println("Was not 1 or 2");
//        }

        // explaining Switches
        int switchValue = 2;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default: // <----- the equivalent of else
                System.out.println("Was not 1 or 2");
                break;
        }

        // Challenge using char

        char charValue = 'A';

        switch(charValue){

            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C':
                System.out.println("Value was C");
                break;
            case 'D':
                System.out.println("Value was D");
                break;
            case 'E':
                System.out.println("Value was E");
                break;
            default:
                System.out.println("Value was not found.");
                break;
        }

        // using Strings
        String month = "JanuarY";
        switch(month.toLowerCase()){   // toLowerCase converts Strings to lower case
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("June");
            default:
                System.out.println("Not Sure");
        }

    }
}
