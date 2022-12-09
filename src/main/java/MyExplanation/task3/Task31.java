package MyExplanation.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task31 {

    private static String input;

    public static void main(String[]args){
        ArrayList<Double> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Please write price or type 'exit'");
            input = scanner.nextLine();
            if (input.equals("exit")){
                break;
            }
            addPriceToList(input, list);
        }
        System.out.println(list);
        try{
            Double average = getAverage(list);
            System.out.println("average is " + average);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("list is empty");
        }
    }

    public static boolean addPriceToList(String string, ArrayList<Double> list){
        Double parsed = null;
       try {
           parsed = Double.parseDouble(string);
       }catch (NullPointerException e){
           System.out.println("The string you are adding to list is null");
           return false;
       }catch (NumberFormatException e){
           System.out.println("The string you are adding to list is not a number");
           return false;
       }
        list.add(parsed);
        return true;
    }

    public static Double getAverage(ArrayList<Double> list) throws Exception {
        Double sum = 0.0;
        for(Double number : list){
            sum += number;
        }
        if (list.size() == 0){
            throw new Exception("List size is zero");
        }

        return sum / list.size();

    }
}
