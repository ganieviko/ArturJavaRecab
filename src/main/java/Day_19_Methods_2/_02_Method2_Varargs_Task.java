package Day_19_Methods_2;

public class _02_Method2_Varargs_Task {
    public static void main(String[] args) {
        int multiplicationBy1 = multiplication(1);
        System.out.println(multiplicationBy1);
        int multiplicationBy2 = multiplication(1, 2);
        System.out.println(multiplicationBy2);
        int multiplicationBy3 = multiplication(1, 2, 3);
        System.out.println(multiplicationBy3);
        int multiplicationBy4 = multiplication(1, 2, 3, 4);
        System.out.println(multiplicationBy4);
    }

    public static int multiplication(int... varargs){
        System.out.println("The number of argument is: " + varargs.length);
        int multiplication = 1;
        for (int i = 0; i < varargs.length; i++) {
            multiplication *= varargs[i];
        }
        return multiplication;
    }
}
