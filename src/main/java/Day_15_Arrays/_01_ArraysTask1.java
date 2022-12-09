package Day_15_Arrays;

import java.util.Random;

public class _01_ArraysTask1 {
    // declare an array of bytes
    // init it with size 3
    // give each element a random value
    // print all elements
    public static void main(String[] args) {
        byte [] byteArray = new byte [100];
        Random random = new Random();

//        array[0] = (byte) random.nextInt(127);
//        array[1] = (byte) random.nextInt(127);
//        array[2] = (byte) random.nextInt(127);

        for (int i = 0; i < byteArray.length; i++) { // when ever you see repetition like above, consider using loop
            byteArray[i] = (byte) random.nextInt(5);
        }
        for (int i = 0; i < byteArray.length; i++) {
            System.out.print(byteArray[i] + ", ");
        }
    }
}
