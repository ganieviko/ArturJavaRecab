package Day_21_ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class _01_Task4 {
    // create an array list of 4 random integers
    // create a method that adds element at random position
    // public static void addAtRandomPosition(ArrayList<Integers> list, Integer element)

    public static ArrayList<Integer> randomInteger(){
        Random generic = new Random();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            result.add(generic.nextInt());
        }
        return result;
    }

    public static void elementAtRandomPosition(ArrayList<Integer> list, int element){
        Random generic = new Random();
        int index = generic.nextInt(list.size());
        list.add(index, element);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayListInteger = randomInteger();
        System.out.println(arrayListInteger);

        elementAtRandomPosition(arrayListInteger, 32);
        System.out.println(arrayListInteger);

    }
}
