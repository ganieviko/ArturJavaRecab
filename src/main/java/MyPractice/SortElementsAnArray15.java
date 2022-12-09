package MyPractice;

import java.util.Arrays;

public class SortElementsAnArray15 {

    public static void main(String[] args) {

        int unsorted[]
                = {44, 1, 44, 2, 610, 44, 42, 7, 76, 610};

        System.out.println("\nSorted Array " + Arrays.toString(sortedArray(unsorted)));

    }

    public static int[] sortedArray(int[] sorted) {
        int temp = 0;
        for (int i = 0; i < sorted.length; i++) {
            for (int j = i +1; j < sorted.length; j++) {
                if (sorted[i] > sorted[j]){
                    temp = sorted[i];
                    sorted[i]= sorted[j];
                    sorted[j] =temp;
                }
            }
        }
        return sorted;
    }
}
