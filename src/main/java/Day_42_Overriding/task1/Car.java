package Day_42_Overriding.task1;

public class Car extends Vehicle{

    @Override
    public void move(int distance){
        System.out.println("SimpleCar is moving " + distance + " distance");
    }
    public static String getName(){
        return "SimpleCar class";
    }
}
