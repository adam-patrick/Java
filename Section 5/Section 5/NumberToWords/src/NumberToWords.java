public class NumberToWords {
    public static int reverse(int number){
        int reverse = 0;
        int temp = 0;
        while (number != 0) {
            temp = number % 10;
            reverse = reverse * 10 + temp;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        int count = 0;
        if (number < 0){
            return -1;
        } else if(number == 0){
            return 1;
        } else{
            while (number != 0){
                number /= 10;
                count++;
            }
        } return count;
    }

    public static void numberToWords(int number){
        int temp;
        if (number < 0){
            System.out.println("Invalid Value");
        } else if (number == 0){
            System.out.print("Zero ");
        } else{
            int numberOfDigits = getDigitCount(number);
            number = reverse(number);
            for (int i = 0; i < numberOfDigits; i++){
                temp = number % 10;
                number /= 10;
                switch(temp){
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                }
            }
        }
    }
}
