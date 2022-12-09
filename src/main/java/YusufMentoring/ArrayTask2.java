package YusufMentoring;

public class ArrayTask2 {
    // print elements that are greater than average
    public static void main(String[] args) {

        int [] array = {10, 30, 150, 40, 90, 20, 120};
        int sum = 0;
        int average = 0;

        for (int i = 0; i < array.length; i++) {
            sum+= array[i];
        }
        average = sum/array.length;
        System.out.print("Average is: " + average);
        System.out.println();
        System.out.println("---------------");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average){
                System.out.print(array[i] + " ");

            }

        }
    }
}
