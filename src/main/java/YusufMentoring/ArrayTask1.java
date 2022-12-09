package YusufMentoring;

public class ArrayTask1 {
    // Write a Java program to find maximum and minimum value of an array
    public static void main(String[] args) {

        int [] array = {13, 26, 99, 130, 10, 33};
        int min = Integer.MAX_VALUE; // 200.000
        int max = Integer.MIN_VALUE; // -200.000
        for (int a:array) {
            if (a > max){
                max = a;
            }else if (a < min){
                min = a;
            }
        }
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
    }
}
