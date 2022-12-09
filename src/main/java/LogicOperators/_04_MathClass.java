package LogicOperators;

public class _04_MathClass {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = -3;

        System.out.println(Math.abs(c));
        System.out.println(Math.max(a, b));
        System.out.println(Math.max(a, Math.abs(c)));
        System.out.println(Math.min(a, c));

//        round direction is automatic, down of less than half, and up if equal or larger than half
        System.out.println(Math.round(3.3));
        System.out.println(Math.round(3.5));
        System.out.println(Math.round(3.6));

        //        for math ceil, the round direction is only up
        System.out.println(Math.ceil(3.1)); // returns double only
        System.out.println(Math.ceil(5.1));

        //        for math floor, the round direction is down up
        System.out.println(Math.floor(3.1)); // returns double only
        System.out.println(Math.floor(5.1));

        int abs0fC = Math.abs(c);
        System.out.println(Math.max(a, abs0fC));

        System.out.println(Math.sqrt(16));  // returns double only
        System.out.println(Math.pow(4, 3)); // returns double only

        System.out.println(Math.random()); // retuns double, between 0 and 1
    }
}
