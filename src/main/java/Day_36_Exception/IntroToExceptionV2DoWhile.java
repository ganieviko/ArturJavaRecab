package Day_36_Exception;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class IntroToExceptionV2DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd uuuu");

        boolean userInputSuccessfullyParsed = false;
        do {
            System.out.println("Please input date in format of MM dd YYYY");
            String electionDay = scanner.nextLine().substring(0, 10);
            try{
                LocalDate election = LocalDate.parse(electionDay, formatter); // if this line throws exception, the rest of try block is not executed
                userInputSuccessfullyParsed = true;
                System.out.println(election);
            }catch (Exception e){
                // this part will run only if there is an exception
                System.out.println(e.getMessage());
                System.out.println("Your input is incorrect, please use format MM dd YYYY");
            }
        }while (!userInputSuccessfullyParsed);








        try{
            // try running some code that can throw an exeption
        }
        catch (Exception e){
            // handle the exception
        }
    }
}
