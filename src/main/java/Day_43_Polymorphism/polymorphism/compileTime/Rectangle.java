package Day_43_Polymorphism.polymorphism.compileTime;

public class Rectangle extends Shape{
    String display(){
        return "Rectangle";
    }


    String display(String message){
        return "Rectangle contains message " + message;
    }
}
