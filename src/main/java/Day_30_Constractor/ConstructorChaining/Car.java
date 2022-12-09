package Day_30_Constractor.ConstructorChaining;

public class Car {
    String model;
    int year;

    public Car(){
        this("Model not yet defined",1965); // this must be first line, and you can only call one
        System.out.println("this constructor");
    }

    public Car(int year){
        this("Artur Model not yet defined", year);
//        this.model = "Model not yet defined MY Type";
        System.out.println("constructor with 1 parameter");
    }

    public Car(String model, int year){
        this.model = model;
        this.year = year;
        System.out.println("My Constructor with 2 parameters");
    }
}
