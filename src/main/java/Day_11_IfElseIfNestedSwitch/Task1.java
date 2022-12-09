package Day_11_IfElseIfNestedSwitch;

import java.util.Scanner;

public class Task1 {
    // get number from user
    // print ok if number is 1
    // print maybe if number is 2
    // print no if number is 3
    // print dunno if anything else

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write any number");
        int number = scanner.nextInt();

        if (number == 1){
            System.out.println("OK");
        }else if (number == 2){
            System.out.println("MAYBE");
        }else if (number == 3){
            System.out.println("NO");
        }else {
            System.out.println("DUNNO");
        }
    }
}
