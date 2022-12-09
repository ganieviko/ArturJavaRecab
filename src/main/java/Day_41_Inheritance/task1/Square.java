package Day_41_Inheritance.task1;

public class Square extends Rectangle{
    public Square(double side){
        super(side, side);
        name = "Square: special kind of Rectangle";
    }
}
