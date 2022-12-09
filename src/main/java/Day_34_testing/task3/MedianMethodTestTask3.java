package Day_34_testing.task3;

import Day_34_testing.ListStatistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MedianMethodTestTask3 {

    @Test
    public void testCase1() {
        List<Integer> input = new ArrayList<>(Arrays.asList(3, 5, 13));
        Integer expected = 5;

        ListStatisticsTask3 testedClass = new ListStatisticsTask3(input);
        Integer actual = testedClass.getMedian();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        List<Integer> input = new ArrayList<>(Arrays.asList(3, 13, 7, 5, 21, 23, 39, 23, 40, 23, 14, 12, 56, 23, 29));
        Integer expected = 23;

        ListStatisticsTask3 testedClass = new ListStatisticsTask3(input);
        Integer actual = testedClass.getMedian();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCase3() {
        List<Integer> input = new ArrayList<>(Arrays.asList(3, 13, 7, 5, 21, 23, 23, 40, 23, 14, 12, 56, 23, 29));
        Integer expected = 22;

        ListStatisticsTask3 testedClass = new ListStatisticsTask3(input);
        Integer actual = testedClass.getMedian();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCase4() {
        List<Integer> input = new ArrayList<>(Arrays.asList());
        Integer expected = null;

        ListStatisticsTask3 testedClass = new ListStatisticsTask3(input);
        Integer actual = testedClass.getMedian();

        Assert.assertEquals(expected, actual);
    }


}