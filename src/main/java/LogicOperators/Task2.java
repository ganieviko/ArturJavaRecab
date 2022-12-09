package LogicOperators;

import java.util.Scanner;

public class Task2 {
    // get string input from user
    // if it contains 'a' and 'b', print "The input contains both a and b"
    // else print "The input does NOT contain both a and b"
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write you input please");
        String userInput = scanner.nextLine();
//        if(userInput.contains("a") && userInput.contains("b") ){
//            System.out.println("The input contains both a and b");
//        }else {
//            System.out.println("The input does NOT contain both a and b");
//        }

        String output;
        if(userInput.contains("a") && userInput.contains("b")){
            output = "contains";
        } else {
            output = "not contains";
        }
        System.out.println("The input " + output + " both a and b");
    }
}
