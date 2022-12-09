package Day_16_ArrayMethods;

import java.util.Arrays;

public class _03_ArraysEquals_Task1 {
    // create a String array of {"1", "2"}
    // create an in array of {1,2}
    // convert String array into int array
    // compare them together
    public static void main(String[] args){

        String[] stringArray = {"1", "2", "3"};
        int[] intsArray = {1,2, 3};

        // create an int array of the same size as Strings array to hold the converted values
        int[] converted = new int[stringArray.length];

        // integrate over the String array
        for (int i = 0; i < stringArray.length; i++) {
            // convert and copy values one by one
            converted[i]= Integer.parseInt(stringArray[i]);
            System.out.println(Arrays.toString(stringArray));
            System.out.println();
        }

        // compare the int array and converted array
        System.out.println(Arrays.equals(intsArray, converted));
        System.out.println(Arrays.toString(converted));
        System.out.println(Arrays.toString(stringArray));

    }
}
