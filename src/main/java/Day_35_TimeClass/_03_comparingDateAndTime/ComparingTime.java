package Day_35_TimeClass._03_comparingDateAndTime;

import java.time.LocalTime;

public class ComparingTime {
    public static void main(String[]args){
        LocalTime now = LocalTime.now();
        LocalTime twoMinutesAgo = now.plusMinutes(2);

        boolean after = now.isAfter(twoMinutesAgo);
        boolean before = now.isBefore(twoMinutesAgo);
        boolean equals = now.equals(twoMinutesAgo);

        System.out.println(after);
        System.out.println(before);
        System.out.println(equals);
    }
}
