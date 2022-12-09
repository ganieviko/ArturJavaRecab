package Day_16_ArrayMethods;

import java.util.Arrays;
import java.util.Random;

public class _01_ArrayToString_Task1 {
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

        int x = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = x;
        System.out.println("New array after swaping the first and last elements: "+Arrays.toString(array));






        //        int firstIndexOfFirstNumber = stringRepresent.indexOf(',');
//        int lastIndexOfLastNumber = stringRepresent.lastIndexOf(',') + 1;
//
//        System.out.println(stringRepresent.substring(lastIndexOfLastNumber));
//        stringRepresent.substring(lastIndexOfLastNumber);
//
//        System.out.println(stringRepresent.substring(lastIndexOfLastNumber, firstIndexOfFirstNumber));
    }
}
