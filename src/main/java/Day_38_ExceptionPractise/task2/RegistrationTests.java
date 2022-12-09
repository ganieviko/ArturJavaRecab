package Day_38_ExceptionPractise.task2;

import org.junit.Assert;
import org.junit.Test;

public class RegistrationTests {
    Registration registration = new Registration();

    @Test
    public void test1(){
        int actual = registration.countLetters("abc123");
       Assert.assertEquals(3, actual);
    }
    @Test
    public void test2(){
        int actual = Registration.countNumbers("abc123");
        Assert.assertEquals(3, actual);
    }
    @Test
    public void test3(){
        int actual = Registration.countLetters("A123");
        Assert.assertEquals(1, actual);
    }
    @Test
    public void test4(){
        int actual = Registration.countNumbers("A123");
        Assert.assertEquals(3, actual);
    }
    @Test
    public void test5(){
        int actual = Registration.countLetters("123");
        Assert.assertEquals(0, actual);
    }
    @Test
    public void test6(){
        int actual = Registration.countNumbers("123");
        Assert.assertEquals(3, actual);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test7(){
//        try {
            Registration.countLetters(null);
//        }catch (IllegalArgumentException e){
//            String message = e.getMessage();
//            Assert.assertEquals("The input cannot be null", message);
//            throw new IllegalArgumentException();
//        }
        // if I want to check the exception message, then catch and re-throw

    }
    @Test(expected = IllegalArgumentException.class)
    public void test8(){
//       try {
           Registration.countNumbers(null);
//       }catch (IllegalArgumentException e){
//           String message = e.getMessage();
//           Assert.assertEquals("The input cannot be null", message);
//           throw new IllegalArgumentException();
//       }
        // if I want to check the exception message, then catch and re-throw

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPassword1(){
        Registration.checkPassword(null);
    }
    @Test(expected = IllegalArgumentException.class)
    public void checkPassword2(){
        Registration.checkPassword("");
    }
    @Test(expected = IllegalArgumentException.class)
    public void checkPassword3(){
        Registration.checkPassword("        ");
    }
    @Test(expected = IllegalArgumentException.class)
    public void checkPassword4(){
        Registration.checkPassword("asdasd");
    }
    @Test(expected = IllegalArgumentException.class)
    public void checkPassword5(){
        Registration.checkPassword("1asdasd");
    }
    @Test(expected = IllegalArgumentException.class)
    public void checkPassword6(){
        Registration.checkPassword("12asdasd");
    }
    @Test
    public void checkPassword7(){
        Registration.checkPassword("123asdasd");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPassword8(){
        Registration.checkPassword("123456");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPassword9(){
        Registration.checkPassword("123456a");
    }
    @Test(expected = IllegalArgumentException.class)
    public void checkPassword10(){
        Registration.checkPassword("123456ab");
    }

    @Test
    public void checkPassword11(){
        Registration.checkPassword("123456abc");
    }

    @Test
    public void checkPassword12(){
        Registration.checkPassword("123abc");
    }
}
