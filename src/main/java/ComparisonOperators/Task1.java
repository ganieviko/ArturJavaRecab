package ComparisonOperators;

import java.util.Scanner;

public class Task1 {
    // accept some number from user using scanner.nextLine()
    //check if the number is greater than 100

    public static void main (String[]args){
        Scanner numberFromUser = new Scanner(System.in);
        System.out.println("Please write any number");
        String stringFromUser = numberFromUser.nextLine();
        int stringToInteger = Integer.parseInt(stringFromUser);
        if (stringToInteger > 100){
            System.out.println("User number is greater then 100");
        }
    }
}
