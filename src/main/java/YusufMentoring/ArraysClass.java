package YusufMentoring;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int [] array = new int[5];
        int [] array2 = {1, 2, 3,4, 5};
        String[] array3 = {"techno", "study"};

//        System.out.print(Arrays.toString(array2));

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

            for (int a : array2 ) {
                System.out.println(a + " ");
        }
    }
}
