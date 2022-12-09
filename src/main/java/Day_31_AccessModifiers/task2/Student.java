package Day_31_AccessModifiers.task2;

public class Student {
    private String name;
    private int age;

    private Student(){

    }

    public Student(String name, int age){
         this.name = name;
        this.age = age;
    }

    public void getName(){
        System.out.println(name + " " + age);
    }
}
