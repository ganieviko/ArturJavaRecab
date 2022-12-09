package Day_32_nonAccessModifiers.task1;

public class TimeConverterTeacherWay {
    final static int secondsInAMinutes = 60;
    final static int minutesInAnHour = 60;

    static int convertSecondIntoMinutes(int seconds){
        return seconds / secondsInAMinutes;
    }

    static int convertMinutesIntoSeconds(int minutes){
        return minutes * secondsInAMinutes;
    }

    static int convertMinutesIntoHours(int minutes){
        return minutes / minutesInAnHour;
    }

     static int convertHoursIntoMinutes(int hours){
        return hours * minutesInAnHour;
    }
}
