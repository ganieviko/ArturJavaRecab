package Day_19_Methods_2;

public class _02_Method2_Varargs {
    public static void main(String[] args) {
        int sum1 = sum(1);
        System.out.println(sum1);
        int sum2 = sum(1, 2);
        System.out.println(sum2);
        int sum3 = sum(1, 2,3);
        System.out.println(sum3);
        int sum4 = sum(1, 2, 3, 4);
        System.out.println(sum4);
        int sum5 = sum(1, 2, 3, 4, 7, 11);
        System.out.println(sum5);

    }


    public static int sum(int... varargs){ // signature of method
        System.out.println("the number of argument is " + varargs.length);
        int sum = 0;
        for (int i = 0; i < varargs.length; i++) {
            sum += varargs[i];
        }
        return sum;
    }
}
