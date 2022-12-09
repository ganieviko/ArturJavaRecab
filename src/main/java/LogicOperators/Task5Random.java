package LogicOperators;

import java.util.Random;
import java.util.Scanner;

public class Task5Random {
    // ask input from user between 0 and 5
    // generate a random number
    // check if user number and random number are equal
    // if equals print "you win" else "you lose"

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number between 0 and 5");
        int numberFromUser = scanner.nextInt();

        Random random = new Random();
        int max = 5;
        int randomNumber = random.nextInt(max) + 1;

        if (numberFromUser == randomNumber){
            System.out.println("You win");
        }else{
            System.out.println("You lose");
        }

    }
}

