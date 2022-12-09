package Day_24_Collections;

import java.util.*;

public class _02_Converting_Task {
    public static void main(String[] args) {
        // random elements should be from 1 to 9
        // create an array of random numbers of size 10
        // convert that array into a list and add 5 more random elements
        // convert that list into set
        // convert that set back into list, you'll get a list without duplicates
        Random generator = new Random();
        Integer [] arrayOfIntegers = new Integer[10];
        for (int i = 0; i < arrayOfIntegers.length; i++) {
           arrayOfIntegers[i] = generator.nextInt(10);
        }
        System.out.println("Array " + Arrays.toString(arrayOfIntegers));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arrayOfIntegers));
        for (int i = 0; i < 5; i++) {
            list.add(generator.nextInt(10));
        }
        System.out.println("List " + list);

        HashSet<Integer> integerHashSet = new HashSet<>(list);
        System.out.println("Hashset " + integerHashSet);

        list = new ArrayList<>(integerHashSet);
        System.out.println("Back to array list " + list);
    }
}
