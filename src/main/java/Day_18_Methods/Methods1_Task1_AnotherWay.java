package Day_18_Methods;

import java.util.Random;

public class Methods1_Task1_AnotherWay {
    // create an array of size 5, assign some random values from 1 to 10
    // create a method that prints array like "2 3 1 10 2", space between them
    // part 2: create a method that print the sum of an array
    // part 3: create a method that prints the maxNumber element of an array
    public static void main(String[] args) {
        int [] array = new int[5];

        Random generator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(10) +1;
        }

        // call method to print array, pass in array inside the parentheses
        printArray(array);
        // call method to print the sum of the array, pass in array inside the parentheses
        printSumOfArray(array);
        // call method to print the max number of array 
        printMaxNumberElement(array);

        printArray(array);
    }

    public static void printArray(int[] theArrayToPrint){
        // create method definition to print array, method argument should be an array of ints,
        // return type should be void because we're just printing, not returning anything

        for (int i = 0; i < theArrayToPrint.length; i++) {
            System.out.print(theArrayToPrint[i] + " ");
        }
        System.out.println();
    }

    public static void printSumOfArray(int[] theprintSumOfArray){
        int sum = 0;
        for (int i = 0; i < theprintSumOfArray.length; i++) {
            sum += theprintSumOfArray[i];
        }
        System.out.println("The array sum is: " + sum);
    }
    
    public static void printMaxNumberElement(int[] arrayInt){
        int maxNumber = arrayInt[0];
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > maxNumber){
                maxNumber = arrayInt[i];
            }
        }
        System.out.println("The max element of array is: " + maxNumber);
    }
}
