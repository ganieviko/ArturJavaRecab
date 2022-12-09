package LogicOperators;

import java.util.Scanner;

public class TaskFromMentoring2 {
    /* What time of the day is it
    * 8 to 12 Good Morning
    * 12 to 18 Good Afternoon
    * 18 to 22 Good Evening
    * After 22 Good Night*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the time");
        int time = scanner.nextInt();
        if (time < 24) {
            if (time >= 8 && time < 12)
                System.out.println("Good Morning");
            else if (time > 12 && time < 18)
                System.out.println("Good Afternoon");
            else if (time > 18 && time < 22)
                System.out.println("Good Evening");
            else if (time > 22 && time < 24)
                System.out.println("Good Night");
        }else {
            System.out.println("You put incorrect time");
        }
    }
}
