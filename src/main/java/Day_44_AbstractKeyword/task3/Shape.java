package Day_44_AbstractKeyword.task3;

public abstract class Shape {
    private String name;
    abstract double getArea();
    abstract double getPerimeter();

    public String getName() {
        return name;
    }
}
