package Day_12_Loop;

import java.util.Scanner;

public class _04_Task1 {
    // get number from user
    // count from 0 until the number
    // if the count is larger than 10, stop
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write number");
        int userNumber = scanner.nextInt();
        int count = 0;

        while (count < userNumber){
            count++;
            System.out.println(count);
            if (count == 10)
            break;
        }
    }
}
