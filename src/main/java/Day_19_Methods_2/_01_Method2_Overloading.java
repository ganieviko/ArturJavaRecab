package Day_19_Methods_2;

public class _01_Method2_Overloading {
    public static void main(String[]args) {
        int sumOfTwo = sum(5,9);
        System.out.println(sumOfTwo);

        int sumOfThree = sum(1, 2, 5);
        System.out.println(sumOfThree);

        double doubleSum = sum(11.5, 5.6);
        System.out.println(doubleSum);

        double sumOfDouble = sum(11.9, 78);
        System.out.println(sumOfDouble);

        int sumOfInteger = sum(5, 8.36);
        System.out.println(sumOfInteger);
    }

    public static int sum(int a, int b){ // signature of method
        System.out.println("Using method 1");
        return a + b;
    }

    // number of parameters different
    public static int sum(int a, int b, int c){
        System.out.println("Using method 2");

        return a + b +c;
    }

    // type of parameters different
    public static double sum (double a, double b){
        System.out.println("Using method 3");
        return a + b;
    }

    // different order of parameters
    public static double sum(double a, int b){
        System.out.println("Using method 4");
        return a + b;
    }

    // different order of parameters
    public static int sum(int a, double b){
        System.out.println("Using method 5");
        return  (int) (a + b);
    }
}
