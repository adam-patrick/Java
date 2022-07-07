import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        com.example.game.Player link = new com.example.game.Player("Link", 10, 15);
        System.out.println(link.toString());
        saveObject(link);

        link.setHitPoints(8);
        System.out.println(link);
        link.setWeapon("Biggoron Sword");
        saveObject(link);
        System.out.println(link);

        com.example.game.ISaveable stalfos = new com.example.game.Monster("Stalfos", 20, 40);
        System.out.println("Strength = " + ((com.example.game.Monster) stalfos).getStrength());
        System.out.println(stalfos);
        saveObject(stalfos);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(com.example.game.ISaveable objectToSave){
        for (int i = 0; i < objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage");
        }
    }

    public static void loadObject(com.example.game.ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

}
