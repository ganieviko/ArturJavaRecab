package Day_33_GIT.task2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        int sum = 0;
        for (String argument : args){
            int number = Integer.parseInt(argument);
            sum += number;
        }

        System.out.println(sum);
        System.out.println(sum/ args.length);
    }
}
