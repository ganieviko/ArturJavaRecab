package Day_38_ExceptionPractise.task2;

public class Registration {
    public static int countLetters(String input){
        if (input == null){
//            return 0;
            throw new  IllegalArgumentException("The input cannot be null");
        }
        int amountOfLetter= 0;
        for (int i = 0; i < input.length(); i++) {
            char charAt = input.charAt(i);
            if (charAt >= 'a' && charAt<= 'z' || charAt >= 'A' && charAt<= 'Z'){
                amountOfLetter++;
            }
        }
        return amountOfLetter;
    }

    public static int countNumbers(String input){
        if (input == null){
            throw new  IllegalArgumentException("The input cannot be null");
        }
        int amountOfNumbers= 0;
        for (int i = 0; i < input.length(); i++) {
            char charAt = input.charAt(i);
            if (charAt >= '0' && charAt<= '9'){
                amountOfNumbers++;
            }
        }
        return amountOfNumbers;
    }


    public static boolean checkPassword(String password) {
        if (password == null){
            throw new IllegalArgumentException("Password cannot be null");
        }
        if (password.isEmpty()){
            throw new IllegalArgumentException("Password cannot be empty");
        }
        if (password.trim().isEmpty()){
            throw new IllegalArgumentException("Password cannot contain only spaces");
        }
        if (countNumbers(password) < 3){
            throw new IllegalArgumentException("Password must contain at least 3 digits");
        }
        if(countLetters(password) < 3){
            throw new IllegalArgumentException("Password must contain at least 3 letters");
        }
        if (password.length() < 6){
            throw new IllegalArgumentException("Password must have at least 6 characters");
        }
        return true;
    }

}
