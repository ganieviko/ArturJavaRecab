package Day_36_Exception;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitExample {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate afterOneDecade = now.plus(1, ChronoUnit.DECADES);
        System.out.println(afterOneDecade);

        long between = ChronoUnit.DAYS.between(now, afterOneDecade);
        System.out.println(between);

    }
}
