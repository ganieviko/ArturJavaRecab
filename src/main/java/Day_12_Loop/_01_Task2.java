package Day_12_Loop;

import java.util.Scanner;

public class _01_Task2 {
    // get number from user
    // get the sum of number from 0 up to number from user

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write any number please");
        int numbersFromUser = scanner.nextInt();

        int sum = 0;
        int lowerNumber = 0;
        while (lowerNumber < numbersFromUser){
            ++lowerNumber;          // 1, 2, 3, 4
            System.out.println("lowerNumber is currently: " + lowerNumber);
            sum += lowerNumber;     // 1, 3, 6, 10
            System.out.println("the sum is currently: " +sum);
        }
        System.out.println(" the sum is " + sum);
    }
}
