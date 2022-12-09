package Day_16_ArrayMethods;

import java.util.Arrays;

public class _03_ArraysEquals_Task1_Teacher {
    // create a String array of {"1", "2"}
    // create an in array of {1,2}
    // convert String array into int array
    // compare them together
    public static void main(String[] args){

        String[] strings = {"1", "2", "3"};
        int[] ints = {1, 2, 3};

        // create an int array of the same size as Strings array to hold the converted values
        int[] converted = new int[strings.length];
        System.out.println(Arrays.toString(converted));
        // iterate over the Strings array
        for (int i = 0; i < strings.length; i++) {
            // convert and copy values one by one
            String element = strings[i];
            int parsedInt = Integer.parseInt(element);
            converted[i] =  parsedInt;
            System.out.println("Elements String " + element);
        }
        System.out.println(Arrays.toString(converted));
        // compare the ints array and converted array
        System.out.println(Arrays.equals(ints, converted));

    }
}
