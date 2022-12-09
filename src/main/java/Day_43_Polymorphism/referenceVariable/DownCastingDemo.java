package Day_43_Polymorphism.referenceVariable;

import java.util.ArrayList;

public class DownCastingDemo {
    public static void main(String[]args){
        ArrayList<Shape> shapes = new ArrayList<>();

        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();


        shapes.add(rectangle);
        shapes.add(circle);

        for(Shape shape : shapes){

//            Rectangle rectangle1 = shape; // not every shape is rectangle
            try {
                Rectangle rectangle1 = (Rectangle) shape; // I am pretty sure it's a rectangle
                System.out.println(rectangle1.getWidth());
            }catch (ClassCastException e){
                System.out.println("I guess I was wrong, it a rectangle");
            }

        }
    }
}
