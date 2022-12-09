package YusufMentoring;

import java.util.Arrays;

public class ArrayTask2TeacherExample {
    // print elements that are greater than average
    public static void main(String[] args) {

        int [] array = {10, 30, 150, 40, 90, 20, 120};
        int sum = 0;
        System.out.println("Arrays numbers are: " + Arrays.toString(array));
        for (int a : array){
            sum += a;
        }
        int average = sum/ array.length;
        System.out.println("The average is: " + average);
        System.out.println("Number biggest than average are: ");
        for (int a : array){
            if (a > average){
                System.out.print(a + " ");
            }
        }
    }
}
