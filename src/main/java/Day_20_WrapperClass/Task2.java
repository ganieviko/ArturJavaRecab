package Day_20_WrapperClass;

import java.util.Arrays;

public class Task2 {
    // create a method that takes a strings and reverses it, it should return reversed string
    //
    // create a method that takes an array of strings and reverses all the strings in it,
    // it should return an array of reversed strings
    //
    // create a method that takes a 2d array of strings and reverses all the strings in it,
    // it should return a 2d array of reversed strings

    public static void main(String[] args) {
        String reversedString = reversedStringSecond("Hello Artur!");
        System.out.println(reversedString);
        System.out.println();

        String[] myArrayString = {"Artur", "Hello"};
        String[] reversedArray = reversedStringSecond(myArrayString);
        System.out.println(Arrays.toString(reversedArray));
        System.out.println();

        String[][] arrayOfArrays = {
                {"Hello", "World!"},
                {"Hello", "Techno!"}
        };
        String[][] reversed2DArray = reversedStringSecond(arrayOfArrays);
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.println(Arrays.toString(reversed2DArray[i]));

        }
        System.out.println(Arrays.deepToString(reversed2DArray));
    }

    public static String reversedStringSecond(String line){
        String reversed = "";
        int lastIndex = line.length()-1;
        for (int i = lastIndex; i >=0; i--) { // start from last index, untill first index
            reversed += line.charAt(i);
        }
        return reversed;
    }

    public static String[] reversedStringSecond(String[] line){
        String[] result = new String[line.length];
        for (int i = 0; i < line.length; i++) {
//            String element = line[i];
//            String reversed = reversedStringSecond(element);
//            result[i] = reversed;
            result[i] = reversedStringSecond(line[i]);
        }
        return result;
    }

    public static String[][] reversedStringSecond (String[][] line){
        String[][] reversed =  new String[line.length][];
        for (int i = 0; i < line.length; i++) {
            reversed[i] = reversedStringSecond(line[i]);
        }
        return reversed;
    }
}
