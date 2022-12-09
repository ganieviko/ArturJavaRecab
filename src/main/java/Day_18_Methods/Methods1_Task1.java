package Day_18_Methods;

import java.util.Random;

public class Methods1_Task1 {
    // create an array of size 5, assign some random values from 1 to 10
    // create a method that prints array like "2 3 1 10 2", space between them
    public static void main(String[] args) {
        arrayList();
    }

    public static void arrayList(){
        Random generator = new Random();
        int [] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(10) +1;
            System.out.print(array[i] + " ");
        }

    }
}
