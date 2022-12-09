package ScannerClass;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //print out "Enter two numbers to get their sum"
        //Ask user for two numbers, add them and output the result
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter two numbers to get their sum");
        int firstNumber = myScanner.nextInt();
        int secondNumber = myScanner.nextInt();
        int sumOfTwoNumbers = firstNumber + secondNumber;
        System.out.println("Sum of two numbers is " + sumOfTwoNumbers);
    }
}
