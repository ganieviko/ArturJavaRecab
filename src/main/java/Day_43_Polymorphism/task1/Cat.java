package Day_43_Polymorphism.task1;

public class Cat extends Animal{
    public Cat() {
        name = "Cat";
    }

    @Override
    public void makeSound(){
        System.out.println("Meow!");
    }
}
