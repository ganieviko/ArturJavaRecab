package Day_24_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class _02_Converting_Task_TeacherWay {
    public static void main(String[] args) {
        // random elements should be from 1 to 9
        // create an array of random numbers of size 10
        // convert that array into a list and add 5 more random elements
        // convert that list into set
        // convert that set back into list, you'll get a list without duplicates

        Random generator = new Random();
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + generator.nextInt(9);
        }
        System.out.println(Arrays.toString(array));
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));

        for (int i = 0; i < 5; i++) {
            arrayList.add( 1 + generator.nextInt(9));
        }
        System.out.println(arrayList);

        HashSet<Integer> hashSet = new HashSet<>(arrayList);
        System.out.println(hashSet);

        arrayList = new ArrayList<>(hashSet);
        System.out.println(arrayList);
    }
}
