package Day_31_AccessModifiers._02_instanceModifiers.pivateModifier.same;

public class Car {
    private String name;

    private Car(){
        name = "Ferrari";
    }

    public Car(int year){
        this(); // available within the same class
    }

    private String getName(){
        return name;
    }

    public void printName(){
        System.out.println(getName());
    }
}
