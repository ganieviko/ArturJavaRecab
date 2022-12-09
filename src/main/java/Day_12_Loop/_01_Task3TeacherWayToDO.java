package Day_12_Loop;

import java.util.Scanner;

public class _01_Task3TeacherWayToDO {
    // ask the user for pin number
    // if the pin number is incorrect keep asking user for pin number
    // when the pin is correct print out "you are logged in"
    // the correct pin is 8787

    public static void main(String[] args) {
        System.out.println("Please write pin number:");
        int userPin = 0;
        int correctPin = 8787;
        while (userPin != correctPin){
            Scanner scanner = new Scanner(System.in);
            userPin = scanner.nextInt();
//            System.out.println("Pin number is incorrect, try another");
        }
        System.out.println("you are logged in");
    }
}
