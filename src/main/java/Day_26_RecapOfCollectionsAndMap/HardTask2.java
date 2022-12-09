package Day_26_RecapOfCollectionsAndMap;

import java.util.ArrayList;
import java.util.HashMap;

public class HardTask2 {
    /*
     Write a program which creates a concordance of characters occurring in a string (i.e., which characters occur where in a string).
     input = "Concordance Hello World"
        { =[11, 17], a=[7], r=[5, 20], C=[0], c=[3, 9], d=[6, 22], e=[10, 13], W=[18], H=[12], l=[14, 15, 21], n=[2, 8], o=[1, 4, 16, 19]}
    */

    public static void main(String[] args) {
        HashMap<Character, ArrayList<Integer>> map = concordance("Concordance Hello World");
        System.out.println(map);
    }

    public static HashMap<Character, ArrayList<Integer>> concordance(String input){
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            Character charAt = input.charAt(i);

            ArrayList<Integer> indexOfChar = map.get(charAt);
            if (indexOfChar == null){
                indexOfChar = new ArrayList<>();
            }
            indexOfChar.add(i);
            map.put(charAt, indexOfChar);
        }

        return map;
    }

    public static ArrayList<Integer> getPosition(String input, Character character){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char charAt = input.charAt(i);
             if (charAt == character){
                 result.add(i);
             }
        }
        return result;
    }
}
