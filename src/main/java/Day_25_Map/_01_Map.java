package Day_25_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _01_Map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap();

        map.put("QA Tester", 260000);
        map.put("SDET Engineer", 200000);
        map.put("SDET Engineer Software", 250000);
        map.put("Developer", 250000);

        System.out.println(map);

        Integer salary = map.get("SDET Engineer");
        System.out.println("SDET Engineer: " + salary);

        Integer qaTesterSalary = map.get("QA Tester");
        System.out.println("QA Tester Salary is: " + qaTesterSalary);
        System.out.println();

        // getting set of keys
        Set<String> keys = map.keySet();
        System.out.println(keys);
        System.out.println();

        for (String key: keys){
            Integer value = map.get(key);
            System.out.println(key + " == " + value);
        }
        System.out.println();

        // getting list of values
        Collection<Integer> values = map.values();
        for (Integer value : values){
            System.out.println(value);
        }

        // getting entries from map
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " = " + value);
        }

        int size = map.size();
        System.out.println(size);
    }
}
