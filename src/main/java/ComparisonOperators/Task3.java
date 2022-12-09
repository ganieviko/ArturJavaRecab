package ComparisonOperators;

import java.util.Scanner;

public class Task3 {
    //get input from the user as string
    //get the sum of first and last numbers and print it out
    // Example input "12 1 23 4"

    public static void main (String [] args){

        Scanner inputFromUsers = new Scanner(System.in);
        System.out.println("Please write your input");
        String input = inputFromUsers.nextLine();

        int firstIndexOfSpace = input.indexOf(' ');
        String firstWord = input.substring(firstIndexOfSpace);

        int lastIndexOfSpace = input.lastIndexOf(' ');
        String lastWord = input.substring(lastIndexOfSpace + 1);

        int firstNumber = Integer.parseInt(firstWord);
        int lastNumber = Integer.parseInt(lastWord);

        int sum = firstNumber + lastNumber;

        System.out.println("The sum of first and last numbers is " + sum);
    }
}
