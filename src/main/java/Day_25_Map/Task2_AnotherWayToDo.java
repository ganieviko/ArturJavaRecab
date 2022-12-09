package Day_25_Map;

import java.util.HashMap;

public class Task2_AnotherWayToDo {
    public static void main(String[]args){
        // check, does this map contain key "Six", hashMap.get("Six")
        // if not put the it as "Six" = 6

        // part 2: check does this map contain key "Three"
        // if yes, change the value of it to 33
            HashMap<String, Integer> hashMap = new HashMap<>();
            hashMap.put("One", 1);
            hashMap.put("Two", 2);
            hashMap.put("Three", 3);
            hashMap.put("Four", 4);
            hashMap.put("Five", 5);

        System.out.println(hashMap);
            // part 1
       if (!hashMap.containsKey("Six")){
           hashMap.put("Six", 6);
       }

        System.out.println(hashMap);
       // part 2
        if (hashMap.containsKey("Three")){
            hashMap.put("Three", 33);
        }

        System.out.println(hashMap);
    }
}
