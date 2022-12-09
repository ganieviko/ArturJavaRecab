package Day_38_ExceptionPractise.task1;

import java.util.ArrayList;
import java.util.Collections;

public class ExceptionTask1Solution {
    public static void main(String[] args) {
        // 1) where does exception occur
        // 2) catch and handle specific exception
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0,1);
        arrayList.add(1,2);
        arrayList.add(2,3);
        arrayList.add(3,null);

        try {
            arrayList.get(4);
        }catch (Exception e){
            System.out.println(e.getMessage() + " Cannot get element index not found");
        }
        try {
            Collections.max(arrayList);
        }catch (NullPointerException e){
            System.out.println(e + " Cannot get max of element where null value exist");
        }
        arrayList.add(1,2);
        arrayList.add(2,3);
        arrayList.add(0,null);
        System.out.println(arrayList);
    }

}
