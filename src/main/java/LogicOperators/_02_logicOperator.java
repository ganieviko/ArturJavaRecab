package LogicOperators;

public class _02_logicOperator {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;

        System.out.println( a && b ); // true
        System.out.println( a && c ); // false
        System.out.println( a || c ); // false
        System.out.println( !(a || c) );
        System.out.println( !(a && c) );
    }
}
