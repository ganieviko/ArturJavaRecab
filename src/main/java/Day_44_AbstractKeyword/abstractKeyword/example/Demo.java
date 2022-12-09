package Day_44_AbstractKeyword.abstractKeyword.example;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Vehicle> list = new ArrayList<>();
        Car e = new Car();
        list.add(e);
        list.add(new Car());
        list.add(new Truck());
        list.add(new Truck());
        list.add(new Car());
//        list.add(new Vehicle());
//        list.get(0).finalMethod();
        e.finalMethod();
    }
}
