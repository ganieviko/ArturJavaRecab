package Day_35_TimeClass._03_comparingDateAndTime;

import java.time.LocalDateTime;

public class ComparingDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime now2 = LocalDateTime.now();

        boolean after = now.isAfter(now2);
        boolean before = now.isBefore(now2);
        boolean equal = now.isEqual(now2);
        boolean leapYear = now.toLocalDate().isLeapYear();

        System.out.println(after);
        System.out.println(before);
        System.out.println(equal);
        System.out.println(leapYear);
    }
}
