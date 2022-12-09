package Day_32_nonAccessModifiers.task2;

import java.util.Arrays;

public class Month {
   final static String[] arraysMonth = {"January", "February", "March", "April", "May", "June",
                                        "July", "August", "September", "October", "November", "December"};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arraysMonth));
        arraysMonth[1] = "Other";
        System.out.println(Arrays.toString(arraysMonth));
    }
}

