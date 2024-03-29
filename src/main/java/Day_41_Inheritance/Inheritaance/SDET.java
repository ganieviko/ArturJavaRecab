package Day_41_Inheritance.Inheritaance;

public class SDET extends Employee{
    double bonus;
    double salary;
    // if you define field with the same name,
    // now SDET class will have two fields
    // parent field can be accessed using super
    // his own field can be accessed using this


    public SDET(double superSalary, double bonus, double sdetSalary) {
        super(superSalary); // inside the child constructor, you are required to call super constructor first
        // if parent has default or noArgs constructor then, it's implicitly called in child constructor
        // if parent does not have default or noArgs constructor, then you need to explicitly call the super constructor with args
        this.bonus = bonus;
        this.salary = sdetSalary;
    }

    public SDET(double superSalary) {
        super(superSalary);
    }

    public double getBonus() {
        return bonus;
    }

    public double getSalary(){
        return this.salary;
    }

    public double getSuperSalary(){
        return super.salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setSuperSalary(double salary){
        super.salary = salary;
    }

    public double calculateSalary(){
        return this.salary;
    }

    public double superCalculateSalary(){
        return super.calculateSalary();
    }
}
