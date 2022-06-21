public class Main {

    public static void main(String[] args){
        Car porsche = new Car();
        Car holden = new Car();
        // model will be null because no String has been set yet
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("Carrera");
        // model will now be Carrera
        System.out.println("Model is " + porsche.getModel());
    }
}
