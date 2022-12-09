package Day_15_Arrays;

import java.util.Random;

public class _01_ArrayTask4 {

    // declare an array of ints of size 10
    // give each element random value from 1 to 100
    // print all elements in same line
    // print the min(smallest) and max(largest) elements in separate lines

    public static void main(String[]args){
        Random random = new Random();

        int [] array =new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99) + 1;
            System.out.print(array[i] + " ");
            System.out.println();
            System.out.println("-------------");
        }
        int smallest = array[0]; // let's assume that the first element is the smallest
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest){ // check if the next element is smaller than current smallest
                smallest = array[i];  // if yes, assign current smallest to that element
            }
        }
        System.out.println("Smallest is: " + smallest);

        int largest = array[0]; // let's assume that the first element is the largest
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest){ // check if the next element is the larger than current largest
                largest = array[i];  // if yes, now assume that current element is the largest, so we assign it to largest
            }
        }
        System.out.println("Largest is: " + largest);
    }
}
