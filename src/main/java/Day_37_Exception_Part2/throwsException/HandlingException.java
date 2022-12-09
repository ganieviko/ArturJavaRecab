package Day_37_Exception_Part2.throwsException;

public class HandlingException {
    // only checked exceptions should be declared

    public static void methodThatThrowsException()throws Exception{
        System.out.println("methodThatThrowsException");

    }

    // first way to handle exception, surround with try catch
    public static void method1(){
        try {
            methodThatThrowsException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // second way to handle exception, redeclare or to propagate
    public static void method2()throws Exception{
        methodThatThrowsException();
    }

    public static void method3()throws RuntimeException{
//        methodThatThrowsException();
    }

    public static void main(String[] args)  {
        method1();

        try {
            method2 ();
        } catch (Exception e) {
            e.printStackTrace();
        }

        method3();
    }
}
