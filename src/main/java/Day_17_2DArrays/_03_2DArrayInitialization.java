package Day_17_2DArrays;

import java.util.Arrays;
import java.util.Random;

public class _03_2DArrayInitialization {
    public static void main(String[] args) {
        String[] list1= {"1", "2"};
        String[] list2= {"3", "4"};
        String[] list3= {"5", "6"};
        String[][] listOfLists = {{"1", "2"}, {"3", "4"}, {"5", "6"}};
        System.out.println("list of list length is " + listOfLists.length);
        for (int i = 0; i < listOfLists.length; i++) {
            for (int j = 0; j < listOfLists[i].length; j++) {
                System.out.print(listOfLists[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

