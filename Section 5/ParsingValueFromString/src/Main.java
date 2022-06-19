public class Main {

        public static void main(String[] args){
                String numberAsString = "2018.125";
                System.out.println("numberAsString = " + numberAsString);

                // convert String to Integer
                double number = Double.parseDouble(numberAsString);
                System.out.println("number = " + number);

                System.out.println("-----------------------------");

                numberAsString += 1;  // 20181
                number += 1;          // 2019
                System.out.println("numberAsString = " + numberAsString);
                System.out.println("number = " + number);
        }
}