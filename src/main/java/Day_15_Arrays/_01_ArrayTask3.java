package Day_15_Arrays;

public class _01_ArrayTask3 {
    // declare an array of doubles and initialize it with some values, use array = {}
    // get the sum and average of all values in the array
    public static void main(String[]args){

        double [] doubleArray = {3.5, 3.3, 4.7, 4.5};
        double sum = 0.0;
        double average;
        for (int i = 0; i < doubleArray.length; i++) {
            sum += doubleArray[i];
        }
        System.out.println("sum of ArraysClass elements is: " + sum);
        average = sum/ doubleArray.length;
        System.out.println("average of all element is: " + average);
    }
}
