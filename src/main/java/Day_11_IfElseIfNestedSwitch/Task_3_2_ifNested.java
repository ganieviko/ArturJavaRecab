package Day_11_IfElseIfNestedSwitch;

import java.util.Random;

public class Task_3_2_ifNested {
    /*
    * get a random number from 0 to 5
    * if number larger than 2, get another random number and check if it's larger than 3, print "you win", else "you lose"
    * else print, "first number too low to play"
    */

    public static void main(String[] args) {
        Random random = new Random();
        int firstRandomNumber = random.nextInt(5) + 1;
        System.out.println("your first lucky number: " + firstRandomNumber);
        if (firstRandomNumber > 2){
            int secondRandomNumber = random.nextInt(5) + 1;
            System.out.println("your second lucky number: " + secondRandomNumber);
            if (secondRandomNumber > 3){
                System.out.println("you win");
            }else {
                System.out.println("you lose");
            }
        }else {
            System.out.println("first number too low to play");
        }
    }
}
