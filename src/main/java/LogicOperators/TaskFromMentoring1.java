package LogicOperators;

import java.util.Scanner;

public class TaskFromMentoring1 {
    // Get 5 numbers from the user and determine if they are even or odd
    // Sum the numbers that are even and print them

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write five numbers");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int forthNumber = scanner.nextInt();
        int fifthNumber = scanner.nextInt();
        int sum = 0;

        if (firstNumber % 2 == 0){
         sum += firstNumber;        //sum = sum + firstNumber
        }
        if (secondNumber % 2 == 0){
            sum += secondNumber;    //sum = sum + secondNumber
        }
        if (thirdNumber % 2 == 0){
            sum += thirdNumber;
        }
        if (forthNumber % 2 == 0){
            sum += forthNumber;
        }
        if (fifthNumber % 2 == 0){
            sum += fifthNumber;
        }
        System.out.println(sum);
    }
}
