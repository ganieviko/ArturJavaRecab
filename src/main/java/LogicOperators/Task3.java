package LogicOperators;

import java.util.Scanner;

public class Task3 {
    // get a number from the user
    // check if the number is larger or smaller than 100
    // print out "The number is larger/smaller than 100"

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your number");
        int numberFromUser = scanner.nextInt();
//        boolean condition = numberFromUser > 100;

        String result = numberFromUser > 100 ? "larger" : "smaller";
        System.out.println("The number is " + result + " then 100");

        //another way to do it
//        System.out.println("The number is " + (numberFromUser >100 ? "larger" : "smaller") + " than 100");
    }
}