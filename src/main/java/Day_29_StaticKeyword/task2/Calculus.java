package Day_29_StaticKeyword.task2;

public class Calculus {
    public static int a;
    public static int b;
   
    public static int sum(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }
   public static int subtractMethod(int numberOne, int numberTwo){
        return numberOne - numberTwo;
   }
   public static int subtractAbs(int numberOne, int numberTwo){
        return Math.abs(numberOne - numberTwo);
   }
    public static int multiplyMethod(int numberOne, int numberTwo){
        return numberOne * numberTwo;
    }
    public static double divideMethod(double numberOne, int numberTwo){
//        double result = (double) numberOne/numberTwo;
//        return  result;

        if (numberTwo==0){
            System.out.println("You are dividing by zero!");
        }
        return numberOne/numberTwo;
    }
}
