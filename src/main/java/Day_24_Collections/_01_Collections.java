package Day_24_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class _01_Collections {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        Random generator = new Random();
        for (int i = 0; i < 5; i++) {
            list.add(generator.nextInt(10));
            set.add(generator.nextInt(10));
        }
        System.out.println("List " + list);
        System.out.println("HasSet " + set);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        Collections.reverse(list);
        System.out.println("Reverse list " + list);

        Collections.rotate(list, 2);
        System.out.println("Rotated list " + list);

        Collections.shuffle(list);
        System.out.println("Shuffled list " + list);

        Collections.replaceAll(list, 2, 15);
        System.out.println("List with replaced value " + list);

        Integer max = Collections.max(list);
        System.out.println("Max element of list is: " + max);

        Integer min = Collections.min(list);
        System.out.println("Min element of list is: " + min);

        System.out.println(set);
        Integer maxNumberOfSet = Collections.max(set);
        System.out.println("Max number of set is: " +maxNumberOfSet);

        Integer minNumberOfSet = Collections.min(set);
        System.out.println("Min number of set is: " +minNumberOfSet);


    }
}
