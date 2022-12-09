package Day_48_OOPReview.inheritance;

public class SuperClass {
    private int a;
    int b;

    public SuperClass() {
        System.out.println("Parent constructed");
    }

    public SuperClass(int a, int b) {
        System.out.println("A different Parent constructed");
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }
}
