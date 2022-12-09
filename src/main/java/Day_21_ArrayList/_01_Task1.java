package Day_21_ArrayList;

import java.util.ArrayList;

public class _01_Task1 {
    // create an arraylist of Strings
    // add Red, Green and Blue inside
    // print out all the elements on new line

    // Part:2 create a method that accepts an arraylist and element
    // it should add the element to arraylist at the first position to arraylist

    // Part:3 create a method that accepts an arraylist and element
    // it should add element before last [1, 2, 3] -> [1, 2, 4, 3]

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Green");
        arrayList.add("Blue");
        arrayList.add("Red");
        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        addElementAtTheFirstPosition(arrayList, "Yellow");
        System.out.println();

        for (String elements : arrayList){ // if you don't need index, you can use enhance for loop
            System.out.println(elements);
        }

        addElementBeforeLast(arrayList, "kiwi");
        System.out.println(arrayList);

    }

    public static void addElementAtTheFirstPosition (ArrayList<String> list, String element){
       list.add(0, element);
    }

    public static void addElementBeforeLast(ArrayList<String> list, String element){
        list.add(list.size()-1, element);
    }

}
