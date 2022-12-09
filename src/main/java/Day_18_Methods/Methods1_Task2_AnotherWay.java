package Day_18_Methods;

public class Methods1_Task2_AnotherWay {
    // create a method which check if length of string is at least 8 characters, it returns true or false
    public static void main(String[] args) {
        boolean result = checkLengthIs8("Java is difficult");
        System.out.println(result);
        System.out.println(checkIfLetter('d'));
        System.out.println(countLetters("artusdgsgr24343ssgdsg5"));
        System.out.println(checkIfDigit('a'));

    }

    public static boolean checkLengthIs8(String line){
        if (line.length() >= 8){
            return true;
        }else {
            return false;
        }
    }

    // create a method which checks if character is letter
    public static boolean checkIfLetter(char character){
       return (character >= 'a' && character <='z') || (character >= 'A' && character <='Z');
    }

    // create a method which counts letters in given string
    // example input: "abcde123"
    // example output: 5

    public static int countLetters(String line){
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
           char character = line.charAt(i);
           if (checkIfLetter(character)){
               count++;
           }
        }
        return count;
    }
    // create a method which checks if character is character
    // character >= '0' && character <= '9'

    public static boolean checkIfDigit(char character){
        return character >= '0' && character <= '9';
    }
}
