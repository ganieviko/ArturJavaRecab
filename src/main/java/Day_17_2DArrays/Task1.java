package Day_17_2DArrays;

import java.util.Arrays;

public class Task1 {
    // given an array
    // print all elements in rows and columns
    // get sum and average of all elements
    // get sum and average of each row
    // get sum and average of each column
    public static void main(String[] args) {
        int[][] ints = {{1,2,3}, {4,5,6}, {7,8,9}};

        // Total sum and average
        int sum = 0;
        int average = 0;
        for (int i = 0; i < ints.length; i++) {
            average += ints[i].length;
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j] + "\t");
                sum += ints[i][j];
            }
            System.out.println();
        }
        System.out.println("Total sum is: " + sum);
        System.out.println("Total average is: " + sum/average);

        System.out.println();

        // Sum and average of row
        int rowAverage = 0;
        for (int i = 0; i < ints.length; i++) {
            int rowSum = 0;

            for (int j = 0; j < ints[i].length; j++) {
                rowSum += ints[i][j];
                rowAverage = rowSum/ints[i].length;  // ints[i] represents the row
            }
            System.out.println("Sum of " + (i+1) + " row is " + rowSum);
            System.out.println("Average sum  of " + (i+1) + " row is: " + rowAverage);
            System.out.println();
        }
        System.out.println();


        // Sum and average of columns
        int columnsSum0 = 0;
        int columnsSum1 = 0;
        int columnsSum2 = 0;


        for (int i = 0; i < ints.length; i++) {
            columnsSum0 += ints[i][0];
            columnsSum1 += ints[i][1];
            columnsSum2 += ints[i][2];
        }
        System.out.println(columnsSum0);
        System.out.println(columnsSum1);
        System.out.println(columnsSum2);

        System.out.println("---------------------");


    }
}

