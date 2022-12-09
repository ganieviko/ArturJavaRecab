package Day_16_ArrayMethods;


import java.util.Arrays;

public class _05_ArraysBinarySearch {
    // return index of given value in sorted array, otherwise returns -1
    // if the array is not sorted the return value is not predictable
    public static void main(String[] args){
        int[] ints = {6, 2, 9, 3, 5, 6, 5}; // what if you have 10000 elements
        System.out.println(Arrays.toString(ints));
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        int indexOfElement = Arrays.binarySearch(ints, 5);
        System.out.println(indexOfElement);

        int key = 5;
        for (int i = 0; i < ints.length; i++) { // this loop will be 10000 iteration
            if (ints[i] == 5){
                System.out.println(i);
                break;
            }

        }
    }
}
