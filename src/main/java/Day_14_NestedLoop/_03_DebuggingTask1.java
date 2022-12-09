package Day_14_NestedLoop;

import java.util.Scanner;

public class _03_DebuggingTask1 {
    // get text from user print only unique
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String charactersIHaveSeenAlready = "";

        for (int i = 0; i < userInput.length(); i++) {
            char charAt = userInput.charAt(i);
            if (!charactersIHaveSeenAlready .contains(charAt+"")) { // only add if I haven't seen before
                charactersIHaveSeenAlready += charAt;
            }
        }
        System.out.println(charactersIHaveSeenAlready);
    }
}
