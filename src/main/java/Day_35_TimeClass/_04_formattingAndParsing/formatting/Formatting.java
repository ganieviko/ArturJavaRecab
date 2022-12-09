package Day_35_TimeClass._04_formattingAndParsing.formatting;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Formatting {
    public static void main(String[]args){
        LocalDate now = LocalDate.now();
        System.out.println(now);

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(now.format(formatter));

        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(now.format(formatter));

        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(now.format(formatter));

        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(now.format(formatter));

        // ofPattern
        formatter = DateTimeFormatter.ofPattern("EEEE, MM-dd-yy, G");
        String formattedDate = now.format(formatter);
        System.out.println("Custom formatted date: " + formattedDate);
    }
}
