package Day_42_Overriding.task1;

public class Vehicle {
    public void move(int distance){
        System.out.println("Vehicle is moving " + distance + " distance");
    }
    
    public static String getName(){
        return "Vehicle class";
    }
}
