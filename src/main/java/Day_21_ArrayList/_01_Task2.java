package Day_21_ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class _01_Task2 {
    // create a method that will create an arrayList of integers with 5 random numbers(1 to 10) and return it

    // part2: create a method that updates the middle element to the element that's provided in parameter
    // [3, 4, 1, 6, 9]  -> provided parameter 100 -> [3, 4, 100, 6, 9]

    public static ArrayList<Integer> createArrayList(){
        ArrayList<Integer> result = new ArrayList<>();
        Random generated = new Random();

        for (int i = 0; i < 5; i++) {
            result.add(generated.nextInt(10) + 1);
        }
        return result;
    }

    public static void updatedMiddleElementInArrayList(ArrayList<Integer> list, Integer number){
        int middleElement = list.size() / 2;
        list.set(middleElement, number);
    }

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = createArrayList();
        System.out.println(arrayList);

        updatedMiddleElementInArrayList(arrayList, 100);
        System.out.println(arrayList);
    }
}
