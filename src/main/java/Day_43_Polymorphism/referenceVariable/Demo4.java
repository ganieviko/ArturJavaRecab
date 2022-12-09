package Day_43_Polymorphism.referenceVariable;

import java.util.ArrayList;

public class Demo4 {

    public static void main(String [] args){
        ArrayList<Object> listOfObjects = new ArrayList<>();
        ArrayList<Shape> shapes = new ArrayList<>();
        ArrayList<Circle> circles = new ArrayList<>();

        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        // each circle is a shape
        // each rectangle is a shape
        shapes.add(rectangle);
        shapes.add(circle);


//        circles.add(new Rectangle()); // not every shape is a circle
        circles.add(new Circle());



    }
}
