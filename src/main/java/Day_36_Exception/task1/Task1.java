package Day_36_Exception.task1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please, write any day format of MM dd YYYY");
        String inputDateFromUser = input.nextLine().substring(0, 10);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd uuuu");
        LocalDate formattedDateFromUser = LocalDate.parse(inputDateFromUser, formatter);

        System.out.println(formattedDateFromUser);

        System.out.println("Please write your Date of Birth");
        String dateOfBirthFromUser = input.nextLine();

        LocalDate formattedDateOfBirthFromUser = LocalDate.parse(dateOfBirthFromUser, formatter);
        Period userAge = Period.between(LocalDate.now(), formattedDateOfBirthFromUser);

        System.out.println(userAge);
    }
}
