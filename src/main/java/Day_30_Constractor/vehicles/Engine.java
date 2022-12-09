package Day_30_Constractor.vehicles;

public class Engine {
    int horsePower;
    int model;
    // no-args
    public Engine(){

    }
    // horsePower constructor
    public Engine(int horsePower){
        this.horsePower = horsePower;

    }
    // model constructor
//    public Engine(int model){ // not possible because we already have one constructor with int
//        this.model = model;
//    }

    // horsePower & model constructors
    public Engine(int horsePower, int model){
        this.horsePower = horsePower;
        this.model = model;
    }

    public void printProperties(){
        System.out.println("The engine horse power is: " + horsePower);
        System.out.println("The engine model is: " + model);
    }
}
