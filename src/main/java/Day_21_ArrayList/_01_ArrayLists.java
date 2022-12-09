package Day_21_ArrayList;

import java.util.ArrayList;

public class _01_ArrayLists {
    public static void main(String[] args) {
        int[] array = new int[2];
        ArrayList<Integer> arrayList = new ArrayList<>();
        // adding element
        arrayList.add(1);
        arrayList.add(2);
        // getting element at specific index
        Integer integer = arrayList.get(1);
        System.out.println(integer);
        // add at specific index
        arrayList.add(1, 3);
        integer = arrayList.get(1);
        System.out.println(integer);

        // printing the array list
        System.out.println(arrayList);

        // add will append at the end of the list
        arrayList.add(4);

        arrayList.add(1);
        System.out.println(arrayList);

        Integer numberOne = 1;
        // remove the first occurrence element an element
        arrayList.remove(numberOne);
        System.out.println(arrayList);

        // remove element at specific index
        arrayList.remove(1);
        System.out.println();
        System.out.println(arrayList);

        // set element at specific index (index, element)
        arrayList.set(1, 5);
        System.out.println("Array List set 2 numbers " + arrayList);

        // get number of elements inside the list
        int size = arrayList.size();
        System.out.println(size);
        arrayList.add(6);

        // remove all the elements inside
        arrayList.clear();
        System.out.println(arrayList.size());

        // check if array list is empty
        boolean emptyOrNot = arrayList.isEmpty();
        System.out.println(emptyOrNot);
    }
}
