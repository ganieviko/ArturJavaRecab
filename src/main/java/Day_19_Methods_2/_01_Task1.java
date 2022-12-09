package Day_19_Methods_2;

import java.util.Arrays;

public class _01_Task1 {
    // create a method that takes a strings and reverses it, it should return reversed string
    //
    // create a method that takes an array of strings and reverses all the strings in it,
    // it should return an array of reversed strings
    //
    // create a method that takes a 2d array of strings and reverses all the strings in it,
    // it should return a 2d array of reversed strings

    public static void main(String[] args) {
        String reversedString = reversedString("Hello Artur!");
        System.out.println(reversedString);

        System.out.println();

        String[] myArrayString = {"Artur", "Hello"};
        String[] reversedArray = reversedString(myArrayString);
        System.out.println(Arrays.toString(reversedArray));
        System.out.println();

        String[][] reversed2DArray = {{"WarAndPeace", "AnnaKarenina"}, {"Faust", "kiwi"}, {"apple", "banana"}};
        for (int i = 0; i < reversed2DArray.length; i++) {
            System.out.println(Arrays.toString(reversed2DArray[i]));
        }

    }

    public static String reversedString(String line){
        String reversed = "";
        for (int i = line.length() - 1; i >= 0; i--) {
            reversed += line.charAt(i);
        }
        return reversed;
    }

    public static String[] reversedString(String[] line){
        String[] reversed = new String[line.length];
        for (int i = 0; i < line.length; i++) {
            reversed[i] = reversedString(line[i]);
        }
        return reversed;
    }

    // create a method that takes a 2d array of strings and reverses all the strings in it,
    // it should return a 2d array of reversed strings

    public static String[][] reversedString(String[][] line){
        String[][] reversed2DArray = new String[line.length][];
        for (int i = 0; i < line.length; i++) {
          reversed2DArray[i] = reversedString(line[i]);
        }
        return reversed2DArray;
    }

}
