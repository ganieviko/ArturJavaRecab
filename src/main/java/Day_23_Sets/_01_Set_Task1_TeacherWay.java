package Day_23_Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class _01_Set_Task1_TeacherWay {
    // create a String[] array of student name in your group, you might make duplicates
    // add all of them to a set

    // create a method that takes set and varargs of String and adds all elements to the set
    // public static void addAll(HashSet<String> set, Strings... elements) {}

    // create a method that takes set and String[], method should adds all elements to the set

    public static void main(String[] args) {
        String[] classmateList = {"Artur", "Ali", "Lena", "Bulent", "Artur", "Dauke", "Turkana", "Vlad"};
        HashSet<String> uniqueMentors = new HashSet<>();
        for (int i = 0; i < classmateList.length; i++) {
            uniqueMentors.add(classmateList[i]);
        }
        System.out.println(uniqueMentors);

        HashSet<String> uniqueMentors2 = new HashSet<>();
        addAll(uniqueMentors2, "Artur", "Tuba", "Shavkat", "Dauke");
        System.out.println(uniqueMentors2);

        HashSet<String> uniqueMentors3 = new HashSet<>();
        addAllAsArray(uniqueMentors3, classmateList);
        System.out.println("Unique mentore 3 " + uniqueMentors3);
    }

    // create a method that takes set and varargs of String and adds all elements to the set
    // public static void addAll(HashSet<String> set, Strings... elements) {}
    public static void addAll(HashSet<String> set, String... elements){
        for (int i = 0; i < elements.length; i++) {
            set.add(elements[i]);
        }
    }

    // create a method that takes set and String[], method should adds all elements to the set
    public static void addAllAsArray(HashSet<String> set, String[] elements){
        for (int i = 0; i < elements.length; i++) {
            set.add(elements[i]);
        }
    }
}
