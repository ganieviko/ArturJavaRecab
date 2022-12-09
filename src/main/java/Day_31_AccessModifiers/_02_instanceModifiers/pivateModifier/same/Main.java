package Day_31_AccessModifiers._02_instanceModifiers.pivateModifier.same;


public class Main {
    public static void main(String[] args) {
        Car car = new Car(1);
        car.printName();

        // below is not available because they are private
//        SimpleCar car = new SimpleCar();
//        String name = car.name;
//        String name1 = car.getName();
    }
}
