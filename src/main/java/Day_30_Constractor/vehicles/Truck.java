package Day_30_Constractor.vehicles;

public class Truck {
    String name;
    String model;
    String color;
    int numberOfTrailers;
    Engine engine;

    // no-args
    public Truck(){
    }

    // name constructor
    public Truck(String name){
        this.name = name;
    }

    // name & model constructor
    public Truck(String name, String model){
        this.name = name;
        this.model = model;
    }

    // name & color & model constructor
    public Truck(String name, String model, String color){
        this.name = name;
        this.color = color;
        this.model = model;
    }

    public Truck(String name, String model, String color, Engine engine) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public Truck(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public Truck(String name, String model, Engine engine) {
        this.name = name;
        this.model = model;
        this.engine = engine;
    }

    public Truck(String name, String model, String color, int numberOfTrailers, Engine engine) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.numberOfTrailers = numberOfTrailers;
        this.engine = engine;
    }

    void printProperties(){
        System.out.println("Name: " + name + " Model: " + model + " Color " + color + "Number of trailer: " + numberOfTrailers);
    }
}
