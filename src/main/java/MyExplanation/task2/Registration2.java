package MyExplanation.task2;

public class Registration2 {
    public static int countLetter(String input){
        if (input == null){
            throw new IllegalArgumentException("input cannot be null");
        }
        int amountOfLetter = 0;
        for (int i = 0; i < input.length(); i++) {
            char charAt = input.charAt(i);
            if (charAt >= 'a' && charAt <= 'z' || charAt >= 'A' && charAt <= 'Z'){
                amountOfLetter++;
            }
        }
        return amountOfLetter;
    }

    public static int countNumber(String input){
        if (input == null){
            throw new  IllegalArgumentException("The input cannot be null");
        }
        int amountOfNumbers = 0;
        for (int i = 0; i < input.length(); i++) {
            char chatAt = input.charAt(i);
            if (chatAt >= '0' && chatAt <= '9'){
                amountOfNumbers++;
            }
        }
        return amountOfNumbers;
    }

    public static boolean checkPassword(String password){
        if (password == null){
            throw new IllegalArgumentException("Password cannot be null");
        }
        if (password.isEmpty()){
            throw new IllegalArgumentException("Password cannot be empty");
        }
        return true;
    }
}
