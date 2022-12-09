package Day_16_ArrayMethods;

import java.util.Arrays;
import java.util.Random;

public class _04_ArraysSort {
     // to sort array in natural order
    public static void main(String[] args){

        Random random = new Random();
        int [] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + random.nextInt(89);
        }
        System.out.println(Arrays.toString(array));

//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));

        System.out.println("Before " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]){
                    // swap
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
//                System.out.println("i:"+i + " j:"+j+" current array: "+Arrays.toString(array));
            }
        }
        System.out.println("After " + Arrays.toString(array));

    }
}
