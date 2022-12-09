package InterviewPreparation.Map;

import java.util.HashMap;

public class _02_MapHadTask {
    /*
     Write a program which counts number characters' occurrences in a string (i.e., which characters occur how many times in a string)
     input = "Occurrences Hello World"
        { =2, c=3, d=1, e=3, H=1, l=3, n=1, O=1, o=2, r=3, s=1, u=1, W=1}
    */

    public static void main(String[]args){

        HashMap<Character, Integer> map = new HashMap<>();
        System.out.println(map);
        String input = "Occurrences Hello World";

        for (int i = 0; i < input.length(); i++) {
            char chatAt = input.charAt(i);
            // get the value of character from the map map.get(O)
            Integer numberOfTimes = map.get(chatAt);
            if (numberOfTimes == null){
                // if the value is null, this is first time I encountered this character
                // set the value of this key to 1
                numberOfTimes=1;
            }else {
                // else, this character is already encountered
                // set the value of this key to ++, increment it
                numberOfTimes++;
            }
            // update the number of character appeared in string
            map.put(chatAt, numberOfTimes);
        }
        System.out.println(map);
    }
}
