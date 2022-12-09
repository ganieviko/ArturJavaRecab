package Day_15_Arrays;

import java.util.Random;

public class _01_ArraysTask1AnotehrWay {
    // declare an array of bytes
    // init it with size 3
    // give each element a random value
    // print all elements

    public static void main(String[] args) {

        // create random object
        Random random = new Random();

        // create byte array
        byte[] nByte = new byte[3];

        // put the next  byte in the array
        for (int i = 0; i < nByte.length; i++) {

            // fills our array with random bytes, could include negative numbers
            random.nextBytes(nByte);

            // check the next value of array
            System.out.print(nByte[i] + ", ");
        }
    }
}
