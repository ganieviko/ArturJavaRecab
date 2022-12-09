package Day_31_AccessModifiers._01_package.packageTwo;

import Day_31_AccessModifiers._01_package.packageOne.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ferrari");
        System.out.println(car.getName());
        Truck truck = new Truck();

//        Plane plane = new Plane(); // not available because is package - private, the access modifier of this class is default

    }
}
