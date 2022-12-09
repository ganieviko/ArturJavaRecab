package Day_42_Overriding.overridingToString;

public class Rectangle extends Shape {
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

    public String toString(){
        return name +
                " \n length: = " + length +
                " \n width: = " + width +
                "\n area: = " + area +
                "\n perimeter: = " + perimeter;
    }
}
