package Day_41_Inheritance.Inheritaance;

public class SDETGrandChild extends SDET{


    public SDETGrandChild(double superSalary, double bonus, double sdetSalary) {
        super(superSalary); // inside the child constructor, you are required to call super constructor first
        // if parent has default or noArgs constructor then, it's implicitly called in child constructor
        // if parent does not have default or noArgs constructor, then you need to explicitly call the super constructor with args
        this.bonus = bonus;
        this.salary = sdetSalary;
    }
}
