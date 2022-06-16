public class Main {

    public static void main(String[] args) {

        int myVariable = 50; //myVariable = 50 is the Expression. int myVariable = 50; is a Statement.
        if (myVariable == 50) {
            System.out.println("Printed");
        }

        myVariable++; // Statement
        myVariable--; // Statement
        System.out.println("This is a test"); // Whole thing is a statement. "This is a test" is the expression

        System.out.println("This is" +
                " another" +
                " still more");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another one");
        // above is still valid

        // in IntelliJ: Code > Reformat Code (will automatically format code)
        // in Windows: Shortcut is Ctrl+Alt+L
    }
}
