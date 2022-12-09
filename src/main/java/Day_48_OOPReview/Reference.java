package Day_48_OOPReview;

import Day_28_PrimitiveVSReference.Person;

public class Reference {
    public static void main(String[]args){
        int a = 20;
        Person person = new Person();

        System.out.println(a);
        System.out.println(person.age);

        changedValue(a);
        changedValue(person);

        System.out.println(a);
        System.out.println(person.age);
    }

    private static void changedValue(int b) {
        b = b + 1;
    }
    private static void changedValue(Person a) {
        a.age = a.age +1;
    }
}
