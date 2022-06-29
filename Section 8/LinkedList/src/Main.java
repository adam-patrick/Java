import java.util.ArrayList;

public class Main {

    public static void main (String[] args){
        Customer customer = new Customer("Douche", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("-----------------------------");
        System.out.println("Balance for customer " + customer.getName() + " is $" + customer.getBalance() + ".");

        System.out.println("-----------------------------");

        // adding values to a list

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println("Index: " + i + " - ELement: " + intList.get(i));
        }

        System.out.println("-----------------------------");

        // inserting a new value at a specific index in the same list

        intList.add(1, 2);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println("Index: " + i + " - ELement: " + intList.get(i));
        }

        System.out.println("-----------------------------");


    }
}
