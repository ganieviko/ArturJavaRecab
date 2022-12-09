package Day_11_IfElseIfNestedSwitch;

import java.util.Scanner;

public class Task_2_3_Switch {
    /*
    * Write a Java program to evaluate exam result of student
    * get a letter from user
    * ex:
    * 'A' -> Excellent !!!
    * 'B' -> Well done
    * 'C' -> Good
    * 'D' -> Need improvement
    * 'F' -> Fail
    * anything else -> Wrong Input
    * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a grade for student Project");
        String gradeFromTeachers = scanner.nextLine();
        char letterFromTeacher = gradeFromTeachers.charAt(0);

        switch (letterFromTeacher){
            case 'A':
                System.out.println("Excellent !!!");
                break;
            case 'B':
                System.out.println("Well done");
                break;
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
