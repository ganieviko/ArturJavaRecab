package Day_24_Collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _01_Collections_Task {
    // create list of 5 numbers from user input
    // sort the list in reverse order(!= reversing) and print it
    // shuffle the list and print it
    // rotate right by 3 places and print it

    // part 2: find the max number and min number, print them
    // replace all max number with min number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
           list.add(scanner.nextInt());
        }
//        System.out.println(list);
//        Collections.reverse(list);
//        System.out.println("Reversed list is: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Another reverse " + list);

        Collections.shuffle(list);
        System.out.println("Shuffled list is " + list);

        Collections.rotate(list, 3);
        System.out.println("Rotated list is " + list);

        Integer maxInteger = Collections.max(list);
        System.out.println("Max number is: " + maxInteger);

        Integer minInteger = Collections.min(list);
        System.out.println("Min number is: " + minInteger);

        Collections.replaceAll(list, maxInteger, minInteger);
        System.out.println("replaced list is: " + list);
    }
}
