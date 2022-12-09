package Day_36_Exception;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class IntroToException {
    public static void main(String[] args) {
        System.out.println("Please input date in format of MM dd YYYY");
        Scanner scanner = new Scanner(System.in);
        String electionDay = scanner.nextLine().substring(0, 10);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd uuuu");
        try{
            LocalDate election = LocalDate.parse(electionDay, formatter);
            System.out.println(election);
        }catch (Exception e){
            // this part will run only if there is an exception
            System.out.println(e.getMessage());
        }



        try{
            // try running some code that can throw an exeption
        }
        catch (Exception e){
            // handle the exception
        }
    }
}
