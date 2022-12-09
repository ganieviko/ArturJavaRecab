package Day_21_ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class _01_Task4_TeacherWay {
    // create an array list of 4 random integers
    // create a method that adds element at random position
    // public static void addAtRandomPosition(ArrayList<Integers> list, Integer element)

    public static void addRandomPosition(ArrayList<Integer> list, Integer element){
        Random generator = new Random();
        int index = generator.nextInt(list.size() + 1); // from 0 to (size - 1), since nextInt doesn't include the bound we can say just size
        list.add(index, element);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random generator = new Random();
        for (int i = 0; i < 4; i++) {
            list.add(generator.nextInt(9)+1);
        }
        System.out.println(list);
        addRandomPosition(list, 11);
        System.out.println(list);
    }
}
