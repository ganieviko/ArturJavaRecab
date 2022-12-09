package Day_41_Inheritance.Inheritaance;

public class Demo {
    public static void main(String[] args) {
        Employee employee = new Employee(10000);
        System.out.println(employee.calculateSalary());

        SDET sdetEmployee = new SDET(0.0, 10000, 120000);
        sdetEmployee.salary = 120000;
        sdetEmployee.bonus = 10000;
        System.out.println(sdetEmployee.calculateSalary());
        sdetEmployee.setSalary(120000);
        sdetEmployee.setSuperSalary(10000);
        System.out.println(sdetEmployee.getSalary());
        System.out.println(sdetEmployee.getSuperSalary());

        SDETGrandChild sdetGrandChild = new SDETGrandChild(1000, 231223, 233);
        double v = sdetGrandChild.calculateSalary();
        System.out.println(v);


    }
}
