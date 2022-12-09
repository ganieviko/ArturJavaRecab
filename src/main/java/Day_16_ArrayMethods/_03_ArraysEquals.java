package Day_16_ArrayMethods;

import java.util.Arrays;

public class _03_ArraysEquals {
    public static void main(String[] args){
        int [] first = {1, 3, 9};
        int [] second = {1, 4, 9};
        int [] third = {1, 3, 9, 4};

        System.out.println(Arrays.equals(first, second));
        System.out.println(Arrays.equals(first, third));
        System.out.println(Arrays.equals(second, third));

        String [] firstString = {"1", "2"};
        String [] secondString = {"1", "2"};

        System.out.println(Arrays.equals(firstString, secondString));

//        String [] str = {"123", "345", "437", "894"};
//        int size = str.length;
//        int [] arr = new int [size];
//        for(int i=0; i<size; i++) {
//            arr[i] = Integer.parseInt(str[i]);
//            System.out.print(arr[i] + " ");
//
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(arr));

    }
}
