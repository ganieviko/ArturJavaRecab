package Day_42_Overriding.hiding;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.calculateAge(LocalDate.now()));


        Child child = new Child();
        System.out.println(child.calculateAge(LocalDate.now()));
        
        Parent parentThatIsChildInside = new Child(); // polymorphism
        System.out.println(parentThatIsChildInside.calculateAge(LocalDate.now())); // hiding

        Parent.calculateAge(LocalDate.now()); // to avoid doubt above call static methods using class name

        System.out.println(parentThatIsChildInside.instanceMethod()); // overriding


    }
}
