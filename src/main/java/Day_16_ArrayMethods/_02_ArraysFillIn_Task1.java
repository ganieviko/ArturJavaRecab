package Day_16_ArrayMethods;

import java.util.Arrays;

public class _02_ArraysFillIn_Task1 {
    // create an array of strings
    // prints the array
    // fill in with value "*"
    // print the array
    public static void main(String[] args){
        String [] stringArray = new String[10];
        System.out.println(Arrays.toString(stringArray));

        Arrays.fill(stringArray, "*");
        System.out.println(Arrays.toString(stringArray));
        Arrays.fill(stringArray, "----------");
        System.out.println(Arrays.toString(stringArray));



    }
}
