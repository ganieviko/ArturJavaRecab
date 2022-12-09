package Day_23_Sets;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_SetCreatingAndAdding {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(3);
        set.add(5);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains(2));
        set.remove(2);
        System.out.println(set.contains(2));
        set.clear();


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(5);
        System.out.println(arrayList);
    }
}
