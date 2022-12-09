package YusufMentoring;

public class ArrayTask3 {
    // Write a Java program to prints the duplicate values of an array of integer values
    public static void main(String[] args) {
        int [] array = {1, 2, 5, 5, 6, 6, 7, 2, 7};

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]){
                    System.out.println("this is a duplicate: " + j);
                }
            }

        }
    }
}
