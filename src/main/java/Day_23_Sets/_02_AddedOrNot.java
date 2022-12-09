package Day_23_Sets;

import java.util.HashSet;
import java.util.Random;

public class _02_AddedOrNot {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        Random generator = new Random();
        for (int i = 0; i < 5; i++) {
            int generatedNUmber = generator.nextInt(5);
            boolean addedOrNot = numbers.add(generatedNUmber);
            System.out.println(generatedNUmber + " is added " + addedOrNot);
        }
        System.out.println(numbers);
    }
}
