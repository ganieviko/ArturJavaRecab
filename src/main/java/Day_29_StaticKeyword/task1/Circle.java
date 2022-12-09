package Day_29_StaticKeyword.task1;

public class Circle {
    public int radius;
    public static int areaCount;
    public static int circumferenceCount;
    public static int anyMethodsCalled;
    public double area(){
        areaCount++;
        anyMethodsCalled++;
        return radius * radius * 3.14; // area = radius square times Pi
    }

    public double circumference(){
        circumferenceCount++;
        anyMethodsCalled++;
//        System.out.println("The circumference of rectangle is " + 2 * radius * 3.14);
        return 2 * radius * 3.14;
    }

    public static int allMethodCount(){
        return circumferenceCount + areaCount;
    }
}
