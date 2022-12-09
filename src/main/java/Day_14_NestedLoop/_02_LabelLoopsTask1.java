package Day_14_NestedLoop;

import java.util.Scanner;

public class _02_LabelLoopsTask1 {
    // get a string from the user 3 strings
    // print each string character in the same line, skip spaces

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write input");

//        String userInput = scanner.nextLine();
        String userInput;                 // variable declaration

        // for - loop
        OUTER_LOOP:
        for (int i = 0; i < 3; i++) {
            System.out.println(i);

            userInput = scanner.nextLine();   // variable assignment

            for (int j = 0; j < userInput.length(); j++) {
                char charAt = userInput.charAt(j);
                if (charAt == ' ') {
                    continue;
                }
                if (charAt == ';') {
                    System.out.println();
                    break OUTER_LOOP;
                }
                System.out.print(charAt);
            }
            System.out.println();
            // for - loop
        }
        System.out.println("After the Outer Loop");
    }
}
