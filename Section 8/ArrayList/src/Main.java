import java.util.ArrayList;
import java.util.Scanner;

public class Main {

//    public static void main(String[] args){

// ___________________________________________________________
        //  Example of working with Arrays

//        System.out.println("Enter 10 integers:");
//        getInput();
//        printArray(baseData);
//        resizeArray();
//        System.out.println("Enter 12 integers:");
//        getInput();
//        printArray(baseData);

//    private static void getInput(){
//        for (int i = 0; i <baseData.length; i++){
//            baseData[i] = s.nextInt();
//        }
//    }
//
//    private static void printArray(int[] arr){
//        for (int i = 0; i < arr.length; i++)
//            System.out.print(arr[i] + " ");
//        System.out.println();
//    }
//
//    private static void resizeArray(){
//        int[] original = baseData;
//
//        baseData = new int[12];
//        for (int i = 0; i < original.length; i++)
//            baseData[i] = original[i];
//    }
// ________________________________________________________________

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args){
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\n0 - To print choice options");
        System.out.println("\n1 - To print the list of grocery items`");
        System.out.println("\n2 - To add an item to the list");
        System.out.println("\n3 - To modify an item in the list");
        System.out.println("\n4 - To remove an item from the list");
        System.out.println("\n5 - To search for an item in the list");
        System.out.println("\n6 - To quit the application");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Current item name: ");
        String itemNo = scanner.nextLine();
        System.out.print("Enter new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item name: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem);
        } else {
            System.out.println(searchItem + ", not on file.");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);


    }
}
