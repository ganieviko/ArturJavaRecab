package Day_28_PrimitiveVSReference.task2;

public class Task2 {
    public static void main(String[]args){

        Rectangle r1 = new Rectangle();
        r1.length = 5;
        r1.width = 7;
        System.out.println("r1.perimeter is " + r1.perimeter());

        Rectangle r2 = new Rectangle();
        r2.length = 2;
        System.out.println("r2.perimeter is " + r2.perimeter());

        Rectangle r3 = new Rectangle();
        r3.length = 2;
        r3.width = 3;
        System.out.println("r3.perimeter is " + r3.perimeter());
    }
}
