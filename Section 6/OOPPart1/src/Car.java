import java.util.Locale;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // setModel allows the private model variable to be set by Main
//    public void setModel(String model){
//        String validModel = model.toLowerCase();
//        if(validModel.equals("carrera") || validModel.equals("commodore")) {
//            this.model = model;
//        } else {
//            this.model = "unknown";
//        }
//    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }
}
