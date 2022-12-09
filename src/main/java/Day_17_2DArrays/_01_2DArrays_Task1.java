package Day_17_2DArrays;

import java.util.Random;

public class _01_2DArrays_Task1 {
    // declare an array of ints of size 3x3
    // give each element random value from 1 to 9
    // print all elements in rows and columns
    public static void main(String[]args){
        Random randomGenerator = new Random();
        int [][] intArray = new int[3][3];
        
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = randomGenerator.nextInt(9)+1;
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.print(intArray[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
