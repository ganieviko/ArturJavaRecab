package Day_16_ArrayMethods;

import java.util.Arrays;

public class _01_ArrayToString {
    public static void main(String[] args){
         int [] array = new int[4];

        String arrayRepresentation = Arrays.toString(array);
        System.out.println(arrayRepresentation);

        array[0] = 1;
        array[array.length - 1] = 4;

        System.out.println(Arrays.toString(array));

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i == array.length -1){
                continue;
            }
            System.out.print(", ");
        }
        System.out.println("]");
    }
}
