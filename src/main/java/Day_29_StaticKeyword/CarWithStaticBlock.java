package Day_29_StaticKeyword;

public class CarWithStaticBlock {
    public String name;
    public static int total;
    static {
        System.out.println("Static block executing");
        total = 10;
    }
    static {
        System.out.println("Second static block executing");
    }
}
