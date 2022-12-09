package Day_27.vehicles;

public class Truck {
    String name;
    String model;
    String color;
    int numberOfTrailers;
    Engine engine;

    void printProperties(){
        System.out.println("Name: " + name + " Model: " + model + " Color " + color + "Number of trailer: " + numberOfTrailers);
    }
}
