package Day_32_nonAccessModifiers.task1;

public class Test {
    public static void main(String[] args) {
        TimeConverter timeConverter = new TimeConverter();

        timeConverter.printSecondsIntoMinute(600);
        timeConverter.printMinutesIntoASeconds(600);
        timeConverter.printMinutesIntoAnHours(600);
        timeConverter.printHoursIntoAMinutes(600);

        System.out.println();

        int minutes = TimeConverterTeacherWay.convertHoursIntoMinutes(6);
        System.out.println(minutes);

        int seconds = TimeConverterTeacherWay.convertMinutesIntoSeconds(minutes);
        System.out.println(seconds);

        int intoMinutes = TimeConverterTeacherWay.convertSecondIntoMinutes(seconds);
        System.out.println(intoMinutes);

        int intoHours = TimeConverterTeacherWay.convertMinutesIntoHours(intoMinutes);
        System.out.println(intoHours);
    }
}
