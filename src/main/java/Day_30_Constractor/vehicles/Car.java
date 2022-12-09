package Day_30_Constractor.vehicles;

public class Car {
    String name;
    String model;
    String color;
    Engine engine;

    // no-args
    public Car(){
    }

    // name constructor
    public Car(String name){
        this.name = name;
    }

    // name & model constructor
    public Car(String name, String model){
        this.name = name;
        this.model = model;
    }

    // name & color & model constructor
    public Car(String name, String model, String color){
        this.name = name;
        this.color = color;
        this.model = model;
    }

    public Car(String name, String model, String color, Engine engine) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public Car(String name, String model, Engine engine) {
        this.name = name;
        this.model = model;
        this.engine = engine;
    }


    void printProperties(){
        System.out.println("Name: " + name + " Model: " + model + " Color " + color);
        engine.printProperties();
    }

    public void installEngine(int horsePower, int model){
        Engine newEngine = new Engine();
        newEngine.horsePower = horsePower;
        newEngine.model = model;

        engine = newEngine;
    }
}
