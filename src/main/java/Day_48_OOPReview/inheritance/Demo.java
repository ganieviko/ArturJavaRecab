package Day_48_OOPReview.inheritance;

public class Demo {
    public static void main(String[] args) {
        SubClass o = new SubClass();
        o.method();
        o.getA();
        SubClass b = o;
        b.getA();
        Object c = b;
        c.toString();


    }
}
