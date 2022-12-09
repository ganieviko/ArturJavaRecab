package Day_25_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _01_Map_delete_After {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap();

        map.put("QA Tester", 260000);
        map.put("SDET Engineer", 200000);
        System.out.println(map);

        Integer salary = map.get("SDET Engineer");
        System.out.println("SDET Engineer: " + salary);

        // getting set of keys
        Set<String> keys = map.keySet();
        System.out.println(keys);

        for (String key : keys){
            Integer value = map.get(key);
            System.out.println(keys + " = " + value);
        }

        // getting list of values
//        Collection<Integer> values = map.values();
//        for (Integer value : values){
//            System.out.println(value);
//        }
//
//        // getting entries from map
//        Set<Map.Entry<String, Integer>> entries = map.entrySet();
//        for (Map.Entry<String, Integer> entry : entries){
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//            System.out.println(key + " = " + value);
//        }

    }
}
