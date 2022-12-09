package Day_26_RecapOfCollectionsAndMap;


import java.util.ArrayList;
import java.util.HashMap;

public class HardTask2_AnotherWay {
    /*
     Write a program which creates a concordance of characters occurring in a string (i.e., which characters occur where in a string).
     input = "Concordance Hello World"
        { =[11, 17], a=[7], r=[5, 20], C=[0], c=[3, 9], d=[6, 22], e=[10, 13], W=[18], H=[12], l=[14, 15, 21], n=[2, 8], o=[1, 4, 16, 19]}
    */
    public static void main(String[] args) {
        String input = "CConocordance Hello World";
        // create a map of character and arraylist of integers
        HashMap<Character, ArrayList<Integer>> map = concordance("CConocordance Hello World");
        System.out.println(map);
        System.out.println(concordance("Hello Techno Study!"));
        System.out.println(concordanceV2("Hello Techno Study!"));
        System.out.println(concordanceV3("Hello Techno Study!"));

    }

    public static HashMap<Character, ArrayList<Integer>> concordance(String input) {
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        // iterate over each char in the input string
        for (int i = 0; i < input.length(); i++) {
            Character charAt = input.charAt(i);
            // try to get this list for that from map
            ArrayList<Integer> indexesList = map.get(charAt);
            if (indexesList == null) {
                // if does not exist assign new empty list
                indexesList = new ArrayList<>();
            }
            // add to this list the current index of the char
            indexesList.add(i);

            map.put(charAt, indexesList); // and store it back in to the map
        }
        return map;
    }

    public static HashMap<Character, ArrayList<Integer>> concordanceV2(String input) {
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        // iterate over each char in the input string
        for (int i = 0; i < input.length(); i++) {
            Character charAt = input.charAt(i);
            // try to get this list for that from map
            ArrayList<Integer> indexesList = map.getOrDefault(charAt, new ArrayList<>());
            indexesList.add(i);

            map.put(charAt, indexesList); // and store it back in to the map
        }
        return map;
    }

    public static HashMap<Character, ArrayList<Integer>> concordanceV3(String input) {
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        // iterate over each char in the input string
        for (int i = 0; i < input.length(); i++) {
            Character charAt = input.charAt(i);

            map.put(charAt, getPositions(input, charAt)); // and store it back in to the map
        }
        return map;
    }

    public static ArrayList<Integer> getPositions(String input, Character character){
        ArrayList<Integer> result = new ArrayList<>();
        // iterate over input string
        for (int i = 0; i < input.length(); i++) {
            char charAt = input.charAt(i);
            // check if character at index i is the same as character from parameters
            if (charAt == character){
                // if same, insert index i of that character in result

                result.add(i);
            }
        }
        return result;
    }

}
