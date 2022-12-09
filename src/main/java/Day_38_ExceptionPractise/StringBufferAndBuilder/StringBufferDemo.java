package Day_38_ExceptionPractise.StringBufferAndBuilder;

import java.time.Duration;
import java.time.LocalTime;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello");
        LocalTime time1 = LocalTime.now();
        for (int i = 0; i < 100000; i++) {
            str.append("hello"); // does not create new object every time
        }
        LocalTime time2 = LocalTime.now();
        Duration between = Duration.between(time1, time2);
        System.out.println(between);
        System.out.println(str.toString());


    }
}
