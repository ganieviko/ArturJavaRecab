package Day_37_Exception_Part2.customException;

public class Demo {
    public static void main(String[] args) {

        String input = "1111";
        if (input.length() > 2) {
            throw new LengthIsMoreThanTwo();
        }
    }
}
