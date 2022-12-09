package Day_25_Map;

import java.util.HashMap;

public class Task2 {
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

        Integer numberSix = hashMap.get("Six");
        if (numberSix == null){
         hashMap.put("Six", 6);
        }
        System.out.println(hashMap);

        Integer numberThree = hashMap.get("Three");
        if (numberThree != null){
            hashMap.replace("Three", 33);
        }
        System.out.println(hashMap);
    }
}
