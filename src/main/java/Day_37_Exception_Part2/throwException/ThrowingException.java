package Day_37_Exception_Part2.throwException;

public class ThrowingException {
    public static void main(String[] args) {
        try {
            throw new Exception("My custom message");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
