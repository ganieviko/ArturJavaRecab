package Day_11_IfElseIfNestedSwitch;

import java.util.Scanner;

public class Task_2_1_Switch {
    // get number from user
    // print ok if number is 5
    // print maybe if number is 3
    // print no if number is 1
    // print dunno if anything else
    // use switch case

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write any number");
        int numberFromUser = scanner.nextInt();

        switch (numberFromUser){
            case 5:
                System.out.println("OK");
                break;
            case 3:
                System.out.println("MAYBE");
                break;
            case 1:
                System.out.println("NO");
                break;
            default:
                System.out.println("DUNNO");
                break;
        }
    }
}
