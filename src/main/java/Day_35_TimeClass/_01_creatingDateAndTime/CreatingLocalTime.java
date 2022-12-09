package Day_35_TimeClass._01_creatingDateAndTime;

import java.time.LocalTime;

public class CreatingLocalTime {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalTime localTime = LocalTime.of(18, 25);
        System.out.println(localTime);

        LocalTime time1 = LocalTime.of(19, 30, 35);
        System.out.println(time1);
    }
}
