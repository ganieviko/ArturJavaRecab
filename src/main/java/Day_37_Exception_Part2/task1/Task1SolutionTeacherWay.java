package Day_37_Exception_Part2.task1;

import java.util.Scanner;

public class Task1SolutionTeacherWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write your input");
        String input = scanner.nextLine();

        Integer output = convertToInteger(input);
        System.out.println(output);
    }

    private static Integer convertToInteger(String input) {
        try {
            return Integer.parseInt(input);
        }catch (NumberFormatException e){
            System.out.println("Could not convert to integer, giving default of 0!");
            return 0;
        }
    }
}
