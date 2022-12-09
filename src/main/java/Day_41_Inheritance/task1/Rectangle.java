package Day_41_Inheritance.task1;

public class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(){} // TODO: will delete this later

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        area = width * length;
        perimeter = 2 * (width + length);
        name = "Rectangle";
    }
}
