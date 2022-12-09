package Day_35_TimeClass._02_manipulatingDateAndTime;

import java.time.LocalDate;

public class ManipulatingDate {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate sevenDaysInFuture = now.plusDays(7);
        System.out.println(now); // date is immutable
        System.out.println(sevenDaysInFuture);

        LocalDate date4yearsFromNow = now.plusYears(4);
        System.out.println(date4yearsFromNow);

        LocalDate nextElectionDay = date4yearsFromNow.minusDays(7);
        System.out.println(nextElectionDay);

        LocalDate nextElectionDayCombined = now.plusYears(4).minusDays(7);
        System.out.println(nextElectionDayCombined);
    }
}
