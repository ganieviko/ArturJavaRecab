package Day_35_TimeClass._03_comparingDateAndTime;

import java.time.LocalDate;

public class ComparingDates {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);

        boolean after = today.isAfter(yesterday);
        boolean before = today.isBefore(yesterday);
        boolean equal = today.isEqual(yesterday);

        System.out.println(after);
        System.out.println(before);
        System.out.println(equal);

        boolean leapYear = today.isLeapYear();
        System.out.println(leapYear);
    }
}
