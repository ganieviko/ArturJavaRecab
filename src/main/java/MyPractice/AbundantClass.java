package MyPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class AbundantClass {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the starting and the ending number :");
        System.out.println(numbs(scanner.nextInt(), scanner.nextInt()));
        scanner.close();
    }

    private static ArrayList<Integer> numbs(int start, int end) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num = start; num < end; num++) {
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0){
                    sum +=i;
                }
            }
            if (sum > num){
                list.add(num);
            }
        }
        return list;
    }
}
