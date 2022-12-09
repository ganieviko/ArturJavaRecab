package Day_24_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class _03_2D_Collections {
    public static void main(String[] args) {
        int[][] twoDimensional = new int[1][];

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);

        ArrayList<ArrayList<Integer>> twoDimensionalList = new ArrayList<>(); // this is a list that contain lists of integers

        twoDimensionalList.add(list);
        twoDimensionalList.add(list2);

        System.out.println("Printing 2 Dimensional List " + twoDimensionalList);

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Artur");
        stringArrayList.add("Marat");
        stringArrayList.add("Emil");

        ArrayList<String> stringArrayList2 = new ArrayList<>();
        stringArrayList2.add("tamara");
        stringArrayList2.add("Ufa");
        stringArrayList2.add("Samara");

        ArrayList<ArrayList<String>> twoDimensionalListString = new ArrayList<>();
        twoDimensionalListString.add(stringArrayList);
        twoDimensionalListString.add(stringArrayList2);
        System.out.println(twoDimensionalListString);

        ArrayList<HashSet<String>> aListOfSets = new ArrayList<>();
        HashSet<String> set1 = new HashSet<>();
        set1.add("Crazy Lessons");
        set1.add("Crazy Teacher");
        HashSet<String> set2 = new HashSet<>();
        set2.add("1");
        set2.add("2");
        set2.add("2");

        aListOfSets.add(set1);
        aListOfSets.add(set2);

        System.out.println(aListOfSets);
    }
}
