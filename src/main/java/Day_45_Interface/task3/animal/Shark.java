package Day_45_Interface.task3.animal;

import Day_45_Interface.task3.interfaces.Sailing;

public class Shark implements Sailing {

    public String food() {
        return "Shark eating another animals";
    }

    @Override
    public void sail() {
        System.out.println("Shark sailing");
    }
}
