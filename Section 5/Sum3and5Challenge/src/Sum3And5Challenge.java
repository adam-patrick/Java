public class Sum3And5Challenge {
    public static void main(String[] args){
        int sum = 0;
        int count = 0;
        for (int i = 1; i < 1001; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                sum += i;
                System.out.println(i + " is divisble by 3 and 5.");
                count++;
                if (count == 5){
                    break;
                }
            }
        }
        System.out.print("Sum is " + sum + ".");
    }
}
