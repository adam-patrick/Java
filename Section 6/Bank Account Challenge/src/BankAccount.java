import java.util.Scanner;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // default constructor is no values are entered into second constructor
    public BankAccount(){
        this("56789", 2.50, "Default", "Default address", "Default Phone");
        System.out.println("Empty constructor called. Default values used.");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public double depositFunds(double balance){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to deposit: ");
        double deposit = scanner.nextDouble();
        balance += deposit;
        System.out.println("Account balance is now $" + balance);
        return balance;
    }

    public double withdrawFunds(double balance){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to withdraw: ");
        double withdrawal = scanner.nextDouble();
        if (balance < withdrawal){
            System.out.println("Insufficient Funds");
            return balance;
        } else{
            balance -= withdrawal;
            System.out.println("Withdrawal confirmed.");
            System.out.println("Account balance is now $" + balance);
            return balance;
        }
    }
}
