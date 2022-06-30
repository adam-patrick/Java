public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
    }

    @Override  // overridden because of specific functionality
    public void fly() {
        System.out.println("I'm a damn penguin. I'm gonna swim instead.");
    }
}
