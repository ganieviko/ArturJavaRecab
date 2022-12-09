package Day_25_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _01_Map_Task1 {
    // create a map of zipcodes and Cities, at least 3 entries
    // get the keySet and iterate over it, print the map like below:
    // zipcode1 => city1
    // zipcode2 => city2
    public static void main(String[] args) {

        HashMap<Integer, String> citiesZip = new HashMap<>();
        citiesZip.put(11214, "Brooklyn");
        citiesZip.put(11206, "Williamsburg");
        citiesZip.put(10002, "Manhattan");
        citiesZip.put(15697, "The Bronx");
        citiesZip.put(14521, "Staten Island");

//        Set<Map.Entry<Integer, String>> entries = citiesZip.entrySet();
//        for (Map.Entry<Integer, String> entry : entries){
//            Integer zipCode = entry.getKey();
//            String district = entry.getValue();
//            System.out.println(zipCode + " => " + district);
//        }
//        System.out.println();

        Set<Integer> keys = citiesZip.keySet();
        for (Integer key : keys){
            System.out.println(key + " => " + citiesZip.get(key));
        }

        System.out.println(keys);
    }
}
