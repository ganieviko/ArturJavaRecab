package InterviewPreparation.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _01_Map_task {
    // create a map of zipcodes and Cities, at least 3 entries
    // get the keySet and iterate over it, print the map like below:
    // zipcode1 => city1
    // zipcode2 => city2

    public static void main(String[]args){
        Map<Integer, String> mapCountries = new HashMap<>();
        mapCountries.put(11214, "Russia");
        mapCountries.put(24313, "USA");
        mapCountries.put(31241, "Egypt");
        mapCountries.put(10002, "Manhattan");
        mapCountries.put(15697, "The Bronx");
        mapCountries.put(14521, "Staten Island");

        Set<Integer> keyCountry = mapCountries.keySet();
        for(Integer key : keyCountry){
            System.out.println(key + " => " + mapCountries.get(key));
        }
        System.out.println(keyCountry);
    }
}
