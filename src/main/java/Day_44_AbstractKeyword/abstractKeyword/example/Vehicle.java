package Day_44_AbstractKeyword.abstractKeyword.example;

public abstract class Vehicle extends Transport{
//    abstract int productionDate;
//    public Vehicle(){
//
//    }
    public abstract void move(int distance);
    public abstract void move(int distance, String units);
    public abstract void fuelUp(int liters);
    public abstract void fly() throws Exception;

    final void finalMethod(){

    }

    public static String getName(){
        return "Vehicle class";
    }

    public void instanceMethod(){
        // to be inherited, may be overridden
    }

    public static void main(String[] args) {
        System.out.println("Hello!");
    }
}
