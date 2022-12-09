package Day_41_Inheritance.Inheritaance;

public class Employee {
   protected double salary;

//   public Employee(){

//   }

    public Employee(double salary) {
        this.salary = salary;
    }

    public double calculateSalary(){
        return this.salary;
    }
}

