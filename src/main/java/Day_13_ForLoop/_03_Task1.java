package Day_13_ForLoop;

import java.util.Scanner;

public class _03_Task1 {
    // get number from the user, print all number from 0 to the number from user
    // skip even numbers using continue
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number please:");
        int input = scanner.nextInt();
        for (int i = 0; i <= input; i++) {
            if (i % 2 == 0){
                continue;
            }
            System.out.println(i);

        }
    }
}
