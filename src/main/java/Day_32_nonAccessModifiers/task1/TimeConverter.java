package Day_32_nonAccessModifiers.task1;

public class TimeConverter {
    final int secondsInAMinute = 60;
    final int minutesInAnHour = 60;
    int amountMinuteInASeconds;
    int getAmountMinuteInASeconds;
    int getMinutesInAnHour;
    int getHoursInAMinute;


    private int secondsIntoMinute(int seconds){
       return amountMinuteInASeconds = seconds * secondsInAMinute;
    }
    public void printSecondsIntoMinute(int seconds){
        secondsIntoMinute(seconds);
        System.out.println(seconds + " minutes in seconds is " + amountMinuteInASeconds);
    }

    private int minutesIntoASeconds(int minutes){
        return getAmountMinuteInASeconds = minutes / secondsInAMinute;
    }
    public void printMinutesIntoASeconds(int minutes){
        minutesIntoASeconds(minutes);
        System.out.println(minutes + " seconds in minutes is " + getAmountMinuteInASeconds);
    }

    private int minutesIntoAnHours(int minutes){
        return getMinutesInAnHour = minutesInAnHour * minutes;
    }
    public void printMinutesIntoAnHours(int minutes){
        minutesIntoAnHours(minutes);
        System.out.println(minutes + " in hours is " + getMinutesInAnHour);
    }

    private int hoursIntoAMinutes(int hours){
        return  getHoursInAMinute =  hours * minutesInAnHour;
    }
    public void printHoursIntoAMinutes(int hours){
        hoursIntoAMinutes(hours);
        System.out.println(hours + " hours is " + getHoursInAMinute + " minutes");
    }
}
