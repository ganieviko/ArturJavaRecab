package Day_16_ArrayMethods;

import java.util.Arrays;
import java.util.Random;

public class _01_ArrayToString_Task1_TeacherVersion {
    // create an array of 4 elements
    // assign each element a random value from 10 to 99
    // print the array using toString method
    // part2: swap first and last elements, print the array again
    public static void main(String[] args){
        Random random = new Random();
        int [] array = new int[4];

        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + random.nextInt(89);
        }
        String stringRepresent = Arrays.toString(array);
        System.out.println(stringRepresent);

        int temp = array[0];              // first store the first element in temp variable
        array[0] = array[array.length-1]; // assign value of last element to first element
        array[array.length - 1] = temp;   // assign temp into last element

        System.out.println(Arrays.toString(array));
    }
}
