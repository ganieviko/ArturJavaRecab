package Day_31_AccessModifiers._02_instanceModifiers.protectedModifier.same;

public class Car {
    protected String name;

    protected Car(){
        name = "Ferrari";
    }

    protected String getName(){
        return name;
    }
}
