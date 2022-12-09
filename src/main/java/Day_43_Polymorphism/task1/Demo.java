package Day_43_Polymorphism.task1;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
//        AbleToEat animalCat = new Cat();
//        animalCat.makeSound();
//
//        AbleToEat animalDog = new Dog();
//        animalDog.makeSound();
//
//        AbleToEat animalHorse = new Horse();
//        animalHorse.makeSound();

        ArrayList<Animal> list = new ArrayList<>();
        list.add(new Cat());
        list.add(new Dog());
        list.add(new Horse());

        for (Animal animal : list){
            animal.makeSound();
            animal.run(10, "miles");
            animal.run(15);
        }
    }
}
