package Day_13_ForLoop;

import java.util.Scanner;

public class _02_Task1 {
    // get a string from user
    // using for-loop print each letter in a new line

    // part 2: stop if you encounter space character
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your input please:");
        String userInput = scanner.nextLine();
//        int lengthOfInput = userInput.length();

        for (int i = 0; i <userInput.length(); i++) {
            char letter = userInput.charAt(i);
            if (letter == ' '){
                break;
            }System.out.println(userInput.charAt(i));
        }
    }
}
