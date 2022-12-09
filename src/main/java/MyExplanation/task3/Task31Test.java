package MyExplanation.task3;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Task31Test {
    @Test
    public void test1(){
        String string = "1";
        ArrayList<Double> list = new ArrayList<>();
        boolean result = Task31.addPriceToList(string, list);
//        Assert.assertEquals(false, result);
        Assert.assertTrue(result);
    }
    @Test
    public void test2(){
        String string = "a";
        ArrayList<Double> list = new ArrayList<>();
        boolean result = Task31.addPriceToList(string, list);
//        Assert.assertEquals(false, result);
        Assert.assertFalse(result);
    }

    @Test
    public void test3(){
        String string = null;
        ArrayList<Double> list = new ArrayList<>();
        boolean result = Task31.addPriceToList(string, list);
//        Assert.assertEquals(false, result);
        Assert.assertFalse(result);
    }

    @Test
    public void test4(){
        String string = "1";
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(1.0));
        boolean result = Task31.addPriceToList(string, list);
//        Assert.assertEquals(false, result);
        Assert.assertTrue(result);
        Assert.assertEquals(2, list.size());
    }

}
