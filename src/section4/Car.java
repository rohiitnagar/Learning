package section4;

public class Car {
    String model;
    String color;
    int horsePower;
    static byte noOfEngines;

    static {
        noOfEngines = 1;
        System.out.println("Static blokc");
    }
    {
        this.model = "SUzuki";
        this.color = "Red";
        System.out.println("Obsject created");
    }
    /* Method defines behaviour of the object */

    public void startCar(){
        System.out.println("Car started");
    }

    public String stopCar(){
        String output = "Car stopped";
        return output;
    }
}
//
