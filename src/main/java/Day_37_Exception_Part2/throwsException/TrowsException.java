package Day_37_Exception_Part2.throwsException;

import java.util.Random;

public class TrowsException {
    public static void main(String[] args) {
        method1();

        try {
            method2();
            System.out.println("This message will not be printed");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void method1(){
        System.out.println("Method 1");
        Random random = new Random();
        boolean shouldThrow = random.nextBoolean();
        if (shouldThrow) {
            throw new RuntimeException("Method !");
        }
    }

    public static void method2()throws Exception{
        System.out.println("Method 2");
        Random random = new Random();
        boolean shouldThrow = random.nextBoolean();
        if (shouldThrow) {
            throw new Exception("Method 2!");
        }
    }
}
