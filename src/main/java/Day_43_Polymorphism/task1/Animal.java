package Day_43_Polymorphism.task1;

public class Animal {
    String name;

    public Animal(){
        this.name = "AbleToEat";
    }

    void run(){
        System.out.println(name + " is running");
    }

    void makeSound(){
        System.out.println(name + " making sound!");
    }

    void run(int meters){
        System.out.println(name + " is running " + meters + " meters!");
    }

    void run(int units, String unit){
        System.out.println(name +  " running " +  units + " is running " + unit + "!");
    }


}
