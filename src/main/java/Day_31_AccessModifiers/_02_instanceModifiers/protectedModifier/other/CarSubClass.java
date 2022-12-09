package Day_31_AccessModifiers._02_instanceModifiers.protectedModifier.other;

import Day_31_AccessModifiers._02_instanceModifiers.protectedModifier.same.Car;

public class CarSubClass extends Car {
    public static void main(String[] args) {
//        SimpleCar car = new SimpleCar();
        CarSubClass car = new CarSubClass();
        String name = car.name;
        String name1 = car.getName();
        System.out.println(name1);
    }
}
