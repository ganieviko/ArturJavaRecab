package Day_13_ForLoop;

import java.util.Scanner;

public class _01_Task4Part2 {
    // write a java program which will show
    // multiplication table of 2
    //ex:
    //    2 x 1 = 2
    //    2 x 2 = 4
    //    2 x 3 = 6
    //    2 x 4 = 8
    //    2 x 5 = 10
    //    2 x 6 = 12
    //    2 x 7 = 14
    //    2 x 8 = 16
    //    2 x 9 = 18
    //    2 x 10 = 20
    // using for-loop

    // Part 2: take the number from user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number you want multiply");
        int i1 = scanner.nextInt();
//        int sum;
        for (int i=1; i <=i1; i++){
//            sum = i1*i;
            System.out.println(i1 + " * " + i + " = "  + i1*i);
        }
    }
}
