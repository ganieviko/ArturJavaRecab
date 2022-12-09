package Day_36_Exception.task1;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task1TeacherMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LocalDate dob = null;
        do {
            System.out.println("Please, write your birth day");
            String inputDateFromUser = input.nextLine();
            dob = convertToDate(inputDateFromUser);
        }while (dob == null);


        Integer getAge = getAge(dob);
        System.out.println("Your age is " + getAge);
    }

    static public LocalDate convertToDate(String userInput){
        LocalDate date = null;
        try {
            date = LocalDate.parse(userInput, DateTimeFormatter.ofPattern("MM dd uuuu"));
        }catch (Exception e){
            System.out.println("User input incorrect");
        }
        return date;
    }

    static public Integer getAge(LocalDate DOB){
        LocalDate now = LocalDate.now();
        Period between = Period.between(DOB, now);
        int age = between.getYears();
        return age;
    }
}
