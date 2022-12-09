package Day_11_IfElseIfNestedSwitch;

import java.util.Random;
import java.util.Scanner;

public class Task_2_3_SwitchGenerateRandom {
    /*
    * Write a Java program to evaluate exam result of student
    * generate random letter
    * ex:
    * 'A' -> Excellent !!!
    * 'B' -> Well done
    * 'C' -> Good
    * 'D' -> Need improvement
    * 'F' -> Fail
    * anything else -> Wrong Input
    * */

    public static void main(String[] args) {
        String gradeFromTeachers = "ABCDFASDASDABC";

        Random random = new Random();
        char letterFromTeacher = gradeFromTeachers.charAt(random.nextInt(gradeFromTeachers.length() - 1)); // index from 0 until  gradeFromTeachers.length() -1

        switch (letterFromTeacher){
            case 'A':
                System.out.println("Excellent !!!");
                break;
            case 'B':
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Need improvement");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Wrong Input");
                break;
        }
    }
}
