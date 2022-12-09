package Day_18_Methods;

public class Methods1_Task2 {
    // create a method which check if length of string is at least 8 characters, it returns true or false
    public static void main(String[] args) {
        String[] stringArray = {"apple", "car", "java", " soft", "home", "Artur", "tree", "week"};

        arrayOfThings(stringArray);
    }
    public static void arrayOfThings (String[] array){
        boolean result = true;
        for (int i = 0; i < array.length; i++) {
            if (array.length < 8){
                result = false;
            }else {
                result = true;
            }
        }
        System.out.println(result);
    }
}
