package Day_16_ArrayMethods;


import java.util.Arrays;

public class _05_ArraysBinarySearch_Task1 {
    // create an array of fruits
    // sort the array
    // search for index of you favorite fruits
    public static void main(String[] args){

        String [] arrayFruits;
        arrayFruits = new String[]{"apple", "banana", "kiwi", "grape", "mango"};
        System.out.println(Arrays.toString(arrayFruits));
        Arrays.sort(arrayFruits);
        System.out.println(Arrays.toString(arrayFruits));
        int kiwi = Arrays.binarySearch(arrayFruits, "kiwi");
        System.out.println(kiwi);
        System.out.println(arrayFruits[kiwi] + " is at index " + kiwi);


    }
}
