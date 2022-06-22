public class Main {

    public static void main(String[] args){
        VIPCustomer person1 = new VIPCustomer();
        System.out.println(person1.getName());

        VIPCustomer person2 = new VIPCustomer("Adam", 20000);
        System.out.println(person2.getName());

        VIPCustomer person3 = new VIPCustomer("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}
