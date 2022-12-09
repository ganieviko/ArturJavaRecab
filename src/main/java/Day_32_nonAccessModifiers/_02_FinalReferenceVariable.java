package Day_32_nonAccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_FinalReferenceVariable {
    public static void main(String[] args) {
       final String[] month = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};

        System.out.println(Arrays.toString(month));

//        month = new String[2];
        month[3] = "Forth Months";
        System.out.println(Arrays.toString(month));

        final ArrayList<String> list = new ArrayList<>();

        list.add("Yes");
        list.add("1st");
        list.add("2st");
//        System.out.println(Arrays.toString(new ArrayList[]{list}));
        System.out.println(list);

//        list = new ArrayList<>();
    }
}
