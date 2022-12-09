package Day_27;

import java.util.*;

public class _01_ObjectsAndClassesTask1 {
    // create a class called Cat with 2 properties and 1 method
    // create 2 objects of this class, set their properties and call their methods

    // create a list of Cats and put your two objects inside that list
    // use enhance for loop to calculate sum of their age, or any other int properties

    // create a static method in _01_ObjectsAndClassesTask1 class to print cat properties
    // public static void print (Cat cat){}

    public static void main(String[] args) {
        Cat zolotoi = new Cat();
        Cat tom = new Cat();

        List<Cat> catsList = new ArrayList<>();
        catsList.add(zolotoi);
        catsList.add(tom);

        System.out.println("I have " + catsList.size() + " cats");
        int sum = 0;
        for (Cat cat : catsList){
            sum = sum + cat.age;
        }


        System.out.println("The total sum of their ages is " + sum);
//        System.out.println("The cats are " + catsList);

        zolotoi.breed = "British";
        zolotoi.age = 4;
        zolotoi.color = "golden";
        zolotoi.weight = 4.7;
        System.out.println("zolotoi is " + zolotoi.breed);
        zolotoi.eating();
        zolotoi.makeSound();
        zolotoi.printProperties();

        tom.age = 7;
        tom.breed = "Street cat";
        tom.color = "Black and White";
        tom.weight = 5.6;
        tom.hunting();
        tom.makeSound();

        print(tom);
        zolotoi.printProperties();

    }

    public static void print (Cat cat){
        System.out.println("The " + cat.color + " cat is " + cat.age + "years of age!");
    }

}
class Cat {
    String breed;
    int age;
    String color;
    double weight;

    void printProperties(){
        System.out.println("The " + color + " cat is " + age + "years of age!");    }

    void eating(){
        System.out.println(breed + "is eating");
    }

    void hunting() {
        System.out.println(breed + " is hunting");
    }

    void makeSound(){
        System.out.println("Cat of color of " + color + "is MEAOWING");
    }
}

