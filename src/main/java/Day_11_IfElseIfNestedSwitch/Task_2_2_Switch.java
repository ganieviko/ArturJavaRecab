package Day_11_IfElseIfNestedSwitch;

import java.util.Random;
import java.util.Scanner;

public class Task_2_2_Switch {
    // get RANDOM number from 1 TO 5
    // print "OK" if number is 5 and print "you win you guessed 5"
    // print "NO" if number is 3 and print "you lose, you guessed 3"
    // print "EXCELLENT" if number is 1 and print "you win, you guessed 1"
    // print "DUNNO, did not recognize the number" if anything else
    // use switch case

    public static void main (String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please write any number");
//        int guessedNumberFromUser = scanner.nextInt();

        Random randomNumber = new Random();
//        int minNumber = 1;
//        int maxNumber = 5;
        int guessedNumber = randomNumber.nextInt(5) + 1;

        switch (guessedNumber){
            case 5:
                System.out.println("OK");
                System.out.println("you win you guessed 5");
                break;
            case 3:
                System.out.println("NO");
                System.out.println("you lose, you guessed 3");
                break;
            case 1:
                System.out.println("EXCELLENT");
                System.out.println("you win, you guessed 1");
                break;
            default:
                System.out.println("DUNNO, did not recognize the number");
        }
    }
}
