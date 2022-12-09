package Day_43_Polymorphism.task1;

public class Dog extends Animal{
    public Dog() {
        name = "Dog";
    }

    @Override
    public void makeSound(){
        System.out.println("Woof!");
    }
}
