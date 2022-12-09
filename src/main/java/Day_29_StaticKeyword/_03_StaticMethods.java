package Day_29_StaticKeyword;

public class _03_StaticMethods {
    public static void main(String[] args) {
        CarWithStaticMethods.print();


        CarWithStaticMethods car = new CarWithStaticMethods();
        car.printInstance();
        car.printInstance2();

        car.print();
    }
}
