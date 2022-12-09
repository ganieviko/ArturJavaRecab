package Day_29_StaticKeyword;

public class _01_StaticVariables {
    public static void main(String[] args) {

        Car.total = 10;
        System.out.println(Car.total);

        Car instance = new Car();
        System.out.println(instance.name);
    }
}

