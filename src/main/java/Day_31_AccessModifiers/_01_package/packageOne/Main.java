package Day_31_AccessModifiers._01_package.packageOne;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ferrari");
        Truck truck = new Truck();

        // both classes available without importing because they are in the same class

        Plane plane = new Plane();
    }
}
