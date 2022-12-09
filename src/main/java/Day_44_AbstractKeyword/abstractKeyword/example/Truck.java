package Day_44_AbstractKeyword.abstractKeyword.example;

public class Truck extends Vehicle{
    @Override
    public void move(int distance) {
        System.out.println("The truck is moving");
    }

    @Override
    public void move(int distance, String units) {

    }

    @Override
    public void fuelUp(int liters) {

    }

    @Override
    public void fly() throws Exception {
        throw new Exception("Truck cannot fly");
    }
}
