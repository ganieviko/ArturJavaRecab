package ComparisonOperators;

import java.util.Scanner;

public class Task2 {
    // get two integers from user using nextInt()
    //concatenate them together
    public static void main(String[] args) {
        Scanner integerNumbers = new Scanner(System.in);
        System.out.println("Please write two integers");
        int firstNumber = integerNumbers.nextInt();
        int secondNumber = integerNumbers.nextInt();

        String firstIntegerToString = Integer.toString(firstNumber);
        String secondIntegerToString = Integer.toString(secondNumber);

        String result = firstIntegerToString.concat(secondIntegerToString);

        System.out.println(result);
    }
}
