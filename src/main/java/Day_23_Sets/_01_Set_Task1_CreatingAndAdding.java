package Day_23_Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class _01_Set_Task1_CreatingAndAdding {
    // create a String[] array of student name in your group, you might make duplicates
    // add all of them to a set

    // create a method that takes set and varargs of String and adds all elements to the set
    // public static void addAll(HashSet<String> set, Strings... elements) {}

    // create a method that takes set and String[], method should adds all elements to the set

    public static void main(String[] args) {
        String[] classmateList = {"Artur", "Ali", "Lena", "Bulent", "Artur", "Dauke"};

        HashSet<String> hashSetClassmate = new HashSet<>();

        for (int i = 0; i < classmateList.length; i++) {
            hashSetClassmate.add(classmateList[i]);
        }
        System.out.println("Using forLoop" + hashSetClassmate);

        hashSetClassmate.addAll(Arrays.asList(classmateList));
        System.out.println("Using addAll" + hashSetClassmate);

        hashSetClassmate.addAll(List.of(classmateList));
        System.out.println("Using ListOf" + hashSetClassmate);

        HashSet<String> mySet = new HashSet<>();
        addAll(mySet, "Baha", "Artur", "Timur", "Dauke");
        System.out.println(mySet);

        HashSet<String> stringHashSet = new HashSet<>();
        String[] stringsArray = {"Baha", "Artur", "Timur", "Dauke"};
        addAll(stringsArray, stringHashSet);
        System.out.println("String array and HasSet " + stringHashSet);

    }
    // create a method that takes set and varargs of String and adds all elements to the set
    // public static void addAll(HashSet<String> set, Strings... elements) {}
    public static void addAll(HashSet<String> set, String... elements){
        for (int i = 0; i < elements.length; i++) {
            set.add(elements[i]);
        }
    }

    // create a method that takes set and String[], method should adds all elements to the set
    public static void addAll(String[] stringsArray, HashSet<String> set){
        for (int i = 0; i < stringsArray.length; i++) {
            set.add(stringsArray[i]);
        }
    }
}
