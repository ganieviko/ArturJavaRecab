package Day_45_Interface.task3;

import Day_45_Interface.task3.animal.Cat;
import Day_45_Interface.task3.animal.Duck;

public abstract class Animal {
    String name;
    int age;

    Animal reproduce(){
        Animal animalChild = null;
        if (this instanceof Cat){
            animalChild = new Cat();
        }
        if (this instanceof Duck){
            animalChild = new Duck();
        }
        animalChild.age = this.age;
        animalChild.name = this.name;
        return animalChild;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
