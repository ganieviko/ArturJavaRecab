package Day_43_Polymorphism.task1;

public class Horse extends Animal{

    public Horse() {
        name = "Horse";
    }

    @Override
    public  void makeSound(){
        System.out.println("Neigh!");
    }
}
