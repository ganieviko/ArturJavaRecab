package Day_37_Exception_Part2.throwException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReTrowingException {
    public static void main(String[] args) {
        try {
            try {
                FileInputStream stream = new FileInputStream("File.txt");
            } catch (Exception exception) {
                System.out.println("File not found");
                throw exception;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
