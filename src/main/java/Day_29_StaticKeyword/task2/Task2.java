package Day_29_StaticKeyword.task2;

public class Task2 {
    public static void main(String[]args){
        Calculus.a = 10;
        Calculus.b = 15;

        int i = Calculus.sum(Calculus.a, Calculus.b);
        System.out.println("Using static variables " + i);

        int i1 = Calculus.sum(5, 8);
        System.out.println("Using static method with parameters " + i1);

        System.out.println(Math.abs(i));

        System.out.println(Math.abs(Calculus.a + Calculus.b));

        double result = Calculus.divideMethod(1, 2);
        System.out.println(result);

        double result2 = Calculus.divideMethod(1, 0);
        System.out.println(result2);

        System.out.println(Calculus.subtractMethod(1, 2));
        System.out.println(Calculus.multiplyMethod(1, 2));

        System.out.println(Calculus.subtractAbs(-5, 9));

    }
}
