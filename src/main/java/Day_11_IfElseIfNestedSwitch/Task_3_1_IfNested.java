package Day_11_IfElseIfNestedSwitch;

import java.util.Scanner;

public class Task_3_1_IfNested {
    // get 2 number from user
    // if first number is larger than zero, check second number if second number is larger than 5 print "ok" else, print "not ok"
    // if first number is less than zero or equal to zero "too cold to check"

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write two numbers");
        int temperature = scanner.nextInt();
        int pressure = scanner.nextInt();

        if (temperature > 0){
            if (pressure > 5){
                System.out.println("ok");
            }else {
                System.out.println("not ok");
            }
        }else {
            System.out.println("too cold to check");
        }
    }
}
