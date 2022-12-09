package Day_35_TimeClass._02_manipulatingDateAndTime;

import java.time.LocalTime;

public class ManipulatingTime {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();

        LocalTime timeInFuture = now.plusHours(2).minusMinutes(10);
        System.out.println(timeInFuture);

        LocalTime timeWithoutSeconds = LocalTime.of(now.getHour(), now.getMinute());
        System.out.println(timeWithoutSeconds);
        LocalTime localTime = timeWithoutSeconds.plusHours(2).plusMinutes(3);
        System.out.println(localTime);

    }
}
