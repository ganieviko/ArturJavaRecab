package Day_42_Overriding.overridingEquals;


public class Circle extends Shape {
    double radius;

    public Circle(double radius){
        this.radius = radius;
        area = Math.PI * radius * radius;
        perimeter = 2 * Math.PI * radius;
        name = "Circle";
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public String toString(){
        return name +
                "\n : radius=" + radius +
                "\n area: " + area +
                "\n perimeter " + perimeter;
    }

    @Override
    public boolean equals(Object anotherCircle){
        try {
            Circle converted = (Circle) anotherCircle;
            return this.radius == converted.radius;
        }catch (ClassCastException | NullPointerException e){
            return false;
        }
    }
}
