package Day_37_Exception_Part2.task2;

public class Demo {
    public static void main(String[] args) throws Exception {
        Car car = new Car();
        car.buy(CarCondition.WASTE);


        car.drive("snow");
    }
}
