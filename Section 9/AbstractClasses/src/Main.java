public class Main {
    
    public static void main(String[] args) {
        System.out.println("============================");
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        System.out.println("============================");

        Parrot parrot = new Parrot("Australian Ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        System.out.println("============================");

        Penguin penguin = new Penguin("Emperor Penguin");
        penguin.fly();

        System.out.println("============================");
    }
}