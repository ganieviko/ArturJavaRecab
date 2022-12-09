package MyExplanation.task2;

import org.junit.Assert;
import org.junit.Test;

public class Registration2Test {
//    Registration2 registration2 = new Registration2();

    @Test
    public void test1(){
        int actual = Registration2.countNumber("artu2r2re22");
        Assert.assertEquals(4, actual);
    }
    @Test
    public void test2(){
        int actual = Registration2.countLetter("Artur4322");
        Assert.assertEquals(5, actual);
    }
}
