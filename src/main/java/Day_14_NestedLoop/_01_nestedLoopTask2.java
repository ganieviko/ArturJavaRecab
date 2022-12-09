package Day_14_NestedLoop;

import java.util.Scanner;

public class _01_nestedLoopTask2 {
    // Write a program that prompts user for 3 integer between 0-100.
    // keep asking until you get correct integers.
    // print out the average of these 3 integers

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        do {
            System.out.println("Please write 3 integers between 0 and 100");
             firstNumber = scanner.nextInt();
        }

        while (firstNumber < 0 || firstNumber > 100);
        System.out.println("First number is correct, please write second");
        secondNumber = scanner.nextInt();

        while (secondNumber < 0 || secondNumber > 100);
        System.out.println("Second number is correct, please write second");
        thirdNumber = scanner.nextInt();

        while (thirdNumber < 0 || thirdNumber > 100);

        double average = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("Average of 3 numbers is: " + average);
    }
}

