package MyExplanation.task2;

import java.util.Scanner;

public class Application {

    public static boolean signUp(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write password");
        String password = scanner.nextLine();
        return Registration2.checkPassword(password);
    }

    public static void main (String [] args){
        int amountOfTempt = 0;
        do {
            amountOfTempt++;
            try {
                if (signUp()){
                    System.out.println("Success");
                    break;
                }
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }while (amountOfTempt < 3);
    }
}
