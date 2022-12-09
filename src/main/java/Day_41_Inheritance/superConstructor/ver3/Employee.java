package Day_41_Inheritance.superConstructor.ver3;

public class Employee {
    public Employee(String message){ // noArgs constructor
        System.out.println("constructor with arguments : " + message);
    }

    public Employee(int number){
        System.out.println("Another constructor");
    }
}
