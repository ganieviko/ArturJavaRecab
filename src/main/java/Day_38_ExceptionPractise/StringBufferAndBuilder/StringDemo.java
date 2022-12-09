package Day_38_ExceptionPractise.StringBufferAndBuilder;

import java.time.Duration;
import java.time.LocalTime;

public class StringDemo {
    public static void main(String[] args) {
        String str = "Hello";
        LocalTime time1 = LocalTime.now();
        // get time
        for (int i = 0; i < 100; i++) {
            str = str.concat("hello"); // new object every time
        }
        LocalTime time2 = LocalTime.now();
        Duration between = Duration.between(time1, time2);
        System.out.println(between);
        System.out.println(str);
        // get time
        // calculate the difference

    }
}
