package Day_12_Loop;

import java.util.Scanner;

public class _03_Task1_DoWhile {
    // ask the user for pin
    // if the pin is incorrect keep asking user for pin
    // when the pin is correct print out "you are logged in"
    // the correct pin is 8787
    // do this task with do-while
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter pin:");
        int correctPin = 8787;
        int userPin = 0;

        do {
            userPin = scanner.nextInt();
        } while (userPin != correctPin);
                System.out.println("you are logged in");
    }
}

