package LogicOperators;

import java.util.Scanner;

public class Task1 {
    // part 1, get string input from user
    // check if it contains 'a' and 'b'
    // check if it contains 'a' or 'c'
    // check if it does NOT contain 'c'
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write input please");
        String inputFromUser = scanner.nextLine();

        System.out.println(inputFromUser.contains("a") && inputFromUser.contains("b"));
        System.out.println(inputFromUser.contains("a") || inputFromUser.contains("c"));
        System.out.println(!(inputFromUser.contains("c")));
    }
}
