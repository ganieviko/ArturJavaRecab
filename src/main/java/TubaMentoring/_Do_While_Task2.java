package TubaMentoring;

public class _Do_While_Task2 {
    // find the square of the numbers between 1 and 7
    // 1 4 9 16 25 36 49
    // use while loop

    public static void main(String[] args) {
        int minNumber = 1;
        int maxNumber = 7;

        while (minNumber <= maxNumber){
            int square = minNumber * minNumber;
            System.out.println("square of the number " + minNumber + " is " + square);
            minNumber++;
        }

    }
}
