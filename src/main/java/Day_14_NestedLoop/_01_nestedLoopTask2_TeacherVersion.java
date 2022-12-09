package Day_14_NestedLoop;

import java.util.Scanner;

public class _01_nestedLoopTask2_TeacherVersion {
    // Write a program that prompts user for 3 integer between 0-100.
    // keep asking until you get correct integers.
    // print out the average of these 3 integers

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        for (int i = 0; i < 3 ; i++) {


        do {
            System.out.println("(" + (+i+1) + ")" + "Please enter an integer between 0 - 100");
            number = scanner.nextInt();
        }while (number < 0 || number > 100);
        sum +=number;
        }
        System.out.println("sum: " + sum);
        System.out.println("average: " + sum/3);
    }
}


