import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner((System.in));
    private static Contacts contacts = new Contacts();

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\n0 - To print choice options");
        System.out.println("\n1 - To print the list of contacts`");
        System.out.println("\n2 - To add a contact to the list");
        System.out.println("\n3 - To modify a contact in the list");
        System.out.println("\n4 - To remove a contact from the list");
        System.out.println("\n5 - To search for a contact in the list");
        System.out.println("\n6 - To quit the application");
    }

    public static void addContact() {
        System.out.print("Please enter a contact name and number to add to the list: ");
        contacts.addContact(scanner.nextLine());
    }

    public static void modifyContact(){
        System.out.print("Enter the current contact name and number to modify: ");
        String contactNo = scanner.nextLine();
        System.out.print("Enter the new contact name and number: ");
        String newContact = scanner.nextLine();
        contacts.modifyContactList(contactNo, newContact);
    }

    public static void removeContact(){
        System.out.print("Enter the contact name and number to remove: ");
        String contactNo = scanner.nextLine();
        contacts.removeContact(contactNo);
    }

    public static void searchForContact(){
        System.out.print("Enter the contact name and number to search for: ");
        String searchContact = scanner.nextLine();
        if (contacts.findContact(searchContact) < 0){
            System.out.println("Found " + searchContact);
        } else {
            System.out.println(searchContact + " is not in the Contact List");
        }
    }

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    contacts.printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }
}
