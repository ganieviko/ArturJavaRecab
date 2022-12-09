package Day_45_Interface.task3.animal;

import Day_45_Interface.task3.Animal;
import Day_45_Interface.task3.interfaces.AbleToEat;

public class Cat extends Animal implements AbleToEat {

    @Override
    public String food() {
        return "Cat's food";
    }

    Animal reproduce(){
        Animal kitten = new Cat();
        kitten.setAge(this.getAge());
        kitten.setName(this.getName());
        return kitten;
    }
}
