package Day_19_Methods_2;

public class _01_Method2_Overloading_Task1 {
    // create a multiply method, that takes two integers and returns their product as integer
    // create a multiply method, that takes three integers and returns their product as integer
    // create a multiply method, that takes two doubles and returns their product as double
    // create a multiply method, that takes three doubles and returns their product as double
    // create a multiply method, that takes one double and one integer and returns their product as double
    // create a multiply method, that takes one integer and one double and returns their product as integer
    public static void main(String[]args) {
        int productOfTwoIntegers = productOfNumbers(4, 4);
        System.out.println(productOfTwoIntegers);

        int productOfThreeIntegers = productOfNumbers(1, 2, 6);
        System.out.println(productOfThreeIntegers);

        double productOfTwoDouble = productOfNumbers(6.2, 8.9);
        System.out.println(productOfTwoDouble);

        double productOfThreeDouble = productOfNumbers(63.5, 8.9, 5.1);
        System.out.println(productOfThreeDouble);

        double productOfDoubleAndInteger = productOfNumbers(6.3, 5);
        System.out.println(productOfDoubleAndInteger);

        int productOfIntegerAndDouble = productOfNumbers(4, 5.6);
        System.out.println(productOfIntegerAndDouble);

        System.out.println("Varargs method: " +  multiply(4, 5, 9));

    }

    public static int multiply(int... numbers){
        int result = 1;
        System.out.println("using method Varargs");
        for (int i = 0; i < numbers.length; i++) {
            result *= numbers [i];
        }
        return result;
    }

    public static int productOfNumbers(int a, int b){
        System.out.println("Using method 1");
        return a * b;
    }

    public static int productOfNumbers(int a, int b, int c){
        System.out.println("Using method 2");
        return a * b * c;
    }

    public static double productOfNumbers(double a, double b){
        System.out.println("Using method 3");
        return a * b;
    }

    public static double productOfNumbers(double a, double b, double c){
        System.out.println("Using method 4");
        return a * b * c;
    }

    public static double productOfNumbers(double a, int b){
        System.out.println("Using method 5");
        return a * b;
    }

    public static int productOfNumbers ( int a, double b){
        System.out.println("Using method 6");
        return (int) (a * b);
    }
}
