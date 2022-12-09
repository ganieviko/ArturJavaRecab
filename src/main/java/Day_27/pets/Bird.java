package Day_27.pets;

import java.util.List;

public class Bird {
    String name;
    String color;
    List<String> listOfNeeds;
    Owner owner;

    public void printProperties(){
        System.out.println("Name: " + name + ", Color: " + color + ", List os need " + listOfNeeds);
        owner.printProperties();
    }
}
