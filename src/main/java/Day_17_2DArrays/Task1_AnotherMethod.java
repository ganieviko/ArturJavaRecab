package Day_17_2DArrays;

import java.util.Arrays;

public class Task1_AnotherMethod {
    // given an array
    // print all elements in rows and columns
    // get sum and average of all elements
    // get sum and average of each row
    // get sum and average of each column
    public static void main(String[] args) {
        int[][] ints = {{1,2,3,7}, {4,5,6,4}, {7,8,9,12}, {35,2,3,5}};
        int rows, columns, sumRow, sumColumns;

        // print our Array
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j] + "\t");
            }
            System.out.println();
        }

        //Calculates number of rows and columns present in given matrix

        rows = ints.length;
        columns = ints[0].length;

        //Calculates sum of each row of given matrix  
        for (int i = 0; i < rows; i++) {
            sumRow =0;
            for (int j = 0; j < ints[i].length; j++) {
                sumRow += ints[i][j];
            }
            System.out.println("sum of " + (i+1) + " row: " + sumRow);
        }
        System.out.println();
        //Calculates sum of each column of given matrix
        int element = 0;
        for (int i = 0; i < ints[0].length; i++) {
            sumColumns = 0;
            for (int j = 0; j < ints.length; j++) {
                sumColumns += ints[j][i];
//                element = ints[1][2];  // 6
            }
            System.out.println("Sum of " + (i+1) + " columns " + sumColumns);
        }
//        System.out.println(element);
    }
}

