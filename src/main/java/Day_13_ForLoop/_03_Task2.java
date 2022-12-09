package Day_13_ForLoop;

import java.util.Scanner;

public class _03_Task2 {
    // get number from the user, print each letters in a new line
    // skip space or semi-column characters
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write an input please:");
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char letters = input.charAt(i);
            if (letters == ' ' || letters == ';'){
                continue;
            }
            System.out.println(letters);
        }
    }
}
