package Day_37_Exception_Part2.task1;

import java.util.Scanner;

public class Task1Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write your input");
        String inputFromUser = scanner.nextLine();
        stringToInteger(inputFromUser);
        System.out.println(inputFromUser);
    }




    public static Integer stringToInteger(String input){
        int converted = 0;
        try {
            converted = Integer.parseInt(input);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return converted;
    }
}
