package Day_34_testing.task2;

import Day_34_testing.ListStatistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoJUnit {

    @Test
    public void testCase1(){
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        Integer expected = 3;

        ListStatistics testedClass = new ListStatistics(input);
        Integer actual = testedClass.getMax();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCase2(){
        List <Integer> input = new ArrayList<>(Arrays.asList(4, 3, 2, 7));
        Integer expected = 7;

        ListStatistics testedClass = new ListStatistics(input);
        Integer actual = testedClass.getMax();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCase3(){
        List <Integer> input = new ArrayList<>(Arrays.asList(4, 3, 2, 7, 10, 5, 44));
        Integer expected = 44;

        ListStatistics testedClass = new ListStatistics(input);
        Integer actual = testedClass.getMax();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCase4(){
        List <Integer> input = new ArrayList<>(Arrays.asList());
        Integer expected = null;

        ListStatistics testedClass = new ListStatistics(input);
        Integer actual = testedClass.getMax();

        Assert.assertEquals(expected, actual);
    }
}
