package Day_37_Exception_Part2.exceptionTypes;

import java.io.FileInputStream;

public class checkedException {
    public static void main(String[] args) {
        FileInputStream stream = null;

//        stream = new FileInputStream("someFile.txt"); must be handled !!!
        try {
             stream = new FileInputStream("someFile.txt");
        }catch (Exception e){
            System.out.println("Cannot open the file !");
        }
    }
}
