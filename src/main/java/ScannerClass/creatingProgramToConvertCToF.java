package ScannerClass;

import java.util.Scanner;

public class creatingProgramToConvertCToF {
   public static void main(String[] args){
       Scanner fahrenheit = new Scanner(System.in);
       System.out.println("Please write Fahrenheit that you want to convert to Celsius");
       double fahrenheitFromUser = fahrenheit.nextDouble();
       double celsius = (fahrenheitFromUser-32)* 5/9;
       System.out.println(fahrenheitFromUser + " Fahrenheit convert to Celsius is " + celsius);
   }
}
