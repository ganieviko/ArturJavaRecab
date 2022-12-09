package Day_35_TimeClass._02_manipulatingDateAndTime.task;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Tasks {
    @Test
    public void task1(){
        LocalDate now = LocalDate.now();
        Assert.assertEquals("2022-01-31", now.toString());
    }

    // task2Part1
    // test that date 5 days ago is 2020-01-26
    @Test
    public void task2(){
        LocalDate now = LocalDate.now();
        LocalDate fiveDaysAgo = now.minusDays(5);
        Assert.assertEquals("2022-01-26", fiveDaysAgo.toString());
    }
    // task3
    // test that time 2 hours now is 9pm

    @Test
    public void task3(){
        LocalTime now = LocalTime.now();
        Assert.assertEquals(21, now.plusHours(2).getHour());
    }
    // task4
    // create a dateTime for April1, 1996, 3:11pm
    // test that date time is "1996-04-01T15:11"
    @Test
    public void test4(){
        LocalDateTime localDateTime = LocalDateTime.of(1996, 4, 1, 15, 11);
        Assert.assertEquals("1996-04-01T15:11", localDateTime.toString());
    }
}
