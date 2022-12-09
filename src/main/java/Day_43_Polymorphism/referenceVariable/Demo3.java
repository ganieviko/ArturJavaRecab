package Day_43_Polymorphism.referenceVariable;

public class Demo3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle = new Square();
//        rectangle = new Object(); // rectangle is a child of Object
        // not every Object is a rectangle
        // but, every rectangle is an Object
        Object object = new Rectangle();
    }
}
