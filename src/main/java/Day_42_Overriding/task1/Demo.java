package Day_42_Overriding.task1;

public class Demo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        System.out.println(car.getClass());
        car.move(10);
        System.out.println(car.getName());
        System.out.println(Car.getName());
    }
}
