package Day_32_nonAccessModifiers.enums._01_task;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please write current Month");
        String enumMonthFromUser = scanner.nextLine();

        Months currentMonth = Months.valueOf(enumMonthFromUser);

        switch (currentMonth){
            case January:
                System.out.println("The start of the year");
                break;
            case June:
                System.out.println("It's summer!");
                break;
            case November:
                System.out.println("Election month!");
                break;
            default:
                System.out.println(currentMonth);
                System.out.println("I don't know this month");

                for (Months months : Months.values()){
                    System.out.println(months);
                }
        }
    }
}
