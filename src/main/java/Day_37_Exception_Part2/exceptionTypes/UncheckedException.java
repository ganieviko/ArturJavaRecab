package Day_37_Exception_Part2.exceptionTypes;

import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input.charAt(2);
        try {
            int length = input.length();
        }catch (Exception e){
            System.out.println("cannot  get input length");
        }

    }
}
