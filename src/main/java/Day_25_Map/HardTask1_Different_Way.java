package Day_25_Map;


import java.util.HashMap;

public class HardTask1_Different_Way {
    /*
     Write a program which counts number characters' occurrences in a string (i.e., which characters occur how many times in a string)
     input = "Occurrences Hello World"
        { =2, c=3, d=1, e=3, H=1, l=3, n=1, O=1, o=2, r=3, s=1, u=1, W=1}
    */
    public static void main(String[] args) {

        HashMap<Character, Integer> map = new HashMap<>();
        System.out.println(map);
        String input = "Occurrences Hello World";
        for (int i = 0; i < input.length(); i++) {
            char charAt = input.charAt(i);

            // gey the value of character from the map if it does not exist set 0
            Integer numberOfTimes = map.getOrDefault(charAt, 0);
            // update the number of character appeared in string
            map.put(charAt, ++numberOfTimes);
        }
            System.out.println(map);
    }
}
