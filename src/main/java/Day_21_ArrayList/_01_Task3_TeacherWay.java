package Day_21_ArrayList;


import java.util.ArrayList;
import java.util.Random;

public class _01_Task3_TeacherWay {
    // create a method that will generate arrayList of 5 doubles with random double values (0 - 100)
    // create a method that takes a list and returns it's total sum
    // create a method that takes a list and returns it's average

    // part 2:
    // create a method that return index of the biggest number
    // public static int max(ArrayList<Double> list)


    public static ArrayList<Double> randomList(){
        ArrayList<Double> result = new ArrayList<>();
        Random generator = new Random();

        for (int i = 0; i < 5; i++) {
            result.add(generator.nextDouble() * 100); // from 0 to 100
        }
        return result;
    }

    public static Double sum(ArrayList<Double> list){
        Double sum = 0.0;
        for (Double element : list){
            sum += element;
        }
        return sum;
    }

    public static Double average(ArrayList<Double> list){
        Double average = sum(list) / list.size();
        return average;
    }

    public static int indexOfMaxNumber(ArrayList<Double> list){
        Double max = list.get(0);
        for (Double element : list){
            if (element > max){
                max = element;
            }
        }

        return list.indexOf(max);
    }

    public static void main (String[] args){
        ArrayList<Double> doubles = randomList();
        System.out.println(doubles);

        Double sum = sum(doubles);
        System.out.println("Sum of Doubles is: " + sum);

        Double average = average(doubles);
        System.out.println("Average of Double Arraylist is " + average);

        System.out.println("Index of biggest element of arraylist is: " + indexOfMaxNumber(doubles));
    }
}

