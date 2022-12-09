package Day_45_Interface.task3.animal;

import Day_45_Interface.task3.Animal;
import Day_45_Interface.task3.interfaces.Flying;
import Day_45_Interface.task3.interfaces.Sailing;

public class Duck extends Animal implements Flying, Sailing {


    @Override
    public String food() {
        return "Duck's food";
    }

    @Override
    public String fly() {
        return "Duck is flying";
    }

    @Override
    public void sail() {
        System.out.println("Duck sailing");
    }
}
