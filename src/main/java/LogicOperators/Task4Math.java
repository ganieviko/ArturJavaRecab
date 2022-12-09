package LogicOperators;

import java.util.Scanner;

public class Task4Math {
    // get two numbers from user
    // print out using Math class the max, min
    // print out square root of the first number
    // print out the result first number to the power of second number

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write two numbers");
        int firstNumberFromUser = scanner.nextInt();
        int secondNumberFromUser = scanner.nextInt();

        int max = Math.max(firstNumberFromUser, secondNumberFromUser);
        System.out.println("The max number is " + max);

        int min = Math.min(firstNumberFromUser, secondNumberFromUser);
        System.out.println("The min number is " + min);


        double sqrtOfFirstNumber =  Math.sqrt(firstNumberFromUser);
        System.out.println("Square root of the first number is " + sqrtOfFirstNumber);

        double pow = Math.pow(firstNumberFromUser, secondNumberFromUser);
        System.out.println("First number to the power of second number is " + pow);


//        another way to do it
        System.out.println(Math.max(firstNumberFromUser, secondNumberFromUser));
        System.out.println(Math.min(firstNumberFromUser,secondNumberFromUser));
        System.out.println(Math.sqrt(firstNumberFromUser));
        System.out.println(Math.pow(firstNumberFromUser,secondNumberFromUser));
    }
}
