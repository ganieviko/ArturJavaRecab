package Day_44_AbstractKeyword.abstractKeyword.example;

public class Boat extends Vehicle{
    @Override
    public void move(int distance) {

    }

    @Override
    public void move(int distance, String units) {

    }

    @Override
    public void fuelUp(int liters){

    }

    @Override
    public void fly() throws Exception {
        throw new Exception("Boat cannot fly yet");
    }
}
