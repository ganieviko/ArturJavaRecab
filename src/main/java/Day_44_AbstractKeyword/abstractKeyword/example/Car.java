package Day_44_AbstractKeyword.abstractKeyword.example;

public class Car extends Vehicle{
    public Car(){
        super();
    }
//    void finalMethod(){
//
//    }
    @Override
    public void move(int distance){
        System.out.println("SimpleCar is moving " + distance + " distance");
    }

    @Override
    public void move(int distance, String units) {

    }

    @Override
    public void fuelUp(int liters) {

    }

    @Override
    public void fly() throws Exception {
        throw new Exception("SimpleCar cannot fly yet");
    }

    public static String getName(){
        return "SimpleCar class";
    }
}
