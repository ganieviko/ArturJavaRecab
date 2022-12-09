package Day_28_PrimitiveVSReference;

public class Task1 {
    // create two methods called "increment"
    // first method accepts int parameter and increments it using ++
    // second method accepts Person parameter and increments its age using ++
    // inside both methods print the value of parameter before and after incrementing


    public static void increment(int parameter){
        System.out.println("int param before incrementing " + parameter);
        parameter++;
        System.out.println("int param after incrementing " + parameter);
    }

    public static void increment(Person parameter){
        System.out.println("Person age before " + parameter.age);
        parameter.age++;
        System.out.println("Person age after " + parameter.age);
    }

    public static void main(String[] args) {
        int number = 2;

        Person person = new Person();
        person.age = 2;

        System.out.println("Before calling the 1st method " + number);
        increment(number);
        System.out.println("After calling the 1st method " + number);

        System.out.println("Before calling the 2st method " + person.age);
        increment(person);
        System.out.println("After calling the 2st method " + person.age);

    }
}
