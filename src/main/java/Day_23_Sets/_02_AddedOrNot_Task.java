package Day_23_Sets;

import java.util.ArrayList;
import java.util.HashSet;

public class _02_AddedOrNot_Task {
    // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
    // count how many duplicates we have

    // find out what are the duplicated values
    public static void main(String[] args) {
        int[] list = {1, 3, 1, 2, 4, 5, 3};

        HashSet<Integer> uniqueValues = new HashSet<>();
        ArrayList<Integer> duplicateValues = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < list.length; i++) {
            int element = list[i];
            boolean added = uniqueValues.add(element);
            if (!added){ // added != true
                count++;
                duplicateValues.add(element);
            }
        }
        System.out.println("Duplicate count is: " + count);
        System.out.println("Duplicate values is: " + duplicateValues);
    }
}
