package InterviewPreparation.Map;

import java.lang.reflect.Array;
import java.util.*;

public class _01_Map {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        Set<String> has_Set = new HashSet<>();
        has_Set.add(capitalCities.get("USA"));
        for (int i = 0; i < capitalCities.size(); i++) {
            has_Set.addAll(capitalCities.keySet());
        }
        System.out.println("HashSet with map key " + has_Set);




        List<Map> mapList = new ArrayList<>();
        mapList.add(capitalCities);
        System.out.println("Printing the key " + mapList.toString());
        for (String i : capitalCities.keySet()){
            System.out.print(i + " ");
        }
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 100);
        map.put("b", 200);
        map.put("c", 300);
        map.put("d", 400);
        System.out.println();

        for(Map.Entry<String, Integer> print : map.entrySet()){

            System.out.print(print.getKey() + ":");
            System.out.println(print.getValue());
        }
    }
}

