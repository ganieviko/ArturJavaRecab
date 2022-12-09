package Day_16_ArrayMethods;


import java.util.Arrays;
import java.util.Random;

public class _04_ArraysSort_Task1 {
    // create an int array of random numbers of size 5
    // sort the array
    // print the first element as min
    // print the last element as max
    // print the middle element as middle
    public static void main(String[]args){
        Random random = new Random();
        int[] intArrays = new int[5];


        for (int i = 0; i < intArrays.length; i++) {
            intArrays[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(intArrays));
        Arrays.sort(intArrays);
        System.out.println(Arrays.toString(intArrays));
        System.out.println("smallest: " + intArrays[0]);
        System.out.println("biggest: " + intArrays[intArrays.length - 1]);
        System.out.println("middle: " + intArrays[intArrays.length/2]);


    }
}
