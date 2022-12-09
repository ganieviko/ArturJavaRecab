package Day_21_ArrayList;


import java.util.ArrayList;
import java.util.Random;

public class _01_Task3 {
    // create a method that will generate arrayList of 5 doubles with random double values (0 - 100)
    // create a method that takes a list and returns it's total sum
    // create a method that takes a list and returns it's average

    // part 2:
    // create a method that return index of the biggest number
    // public static int max(ArrayList<Double> list)

    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = generateDoubleArrayList();
        System.out.println(doubleArrayList);

        double sumOfTheDoubleList = sumOfTheDoubleList(doubleArrayList);
        System.out.println("Sum of the Double list is: " + sumOfTheDoubleList);

        System.out.println("Average of the Double list is: " + averageOfDoubleList(doubleArrayList));

        System.out.println("The index of max element is: " + max(doubleArrayList));
    }

    public static ArrayList<Double> generateDoubleArrayList(){
        ArrayList<Double> result = new ArrayList<>();
        Random generator = new Random();

        for (int i = 0; i < 5; i++) {
            result.add(generator.nextDouble() * 100);
        }
        return result;
    }

    // create a method that takes a list and returns it's total sum

    public static double sumOfTheDoubleList(ArrayList<Double> doubleArrayList){
        double sum = 0;
        for (int i = 0; i < doubleArrayList.size(); i++) {
            sum += doubleArrayList.get(i);
        }
        return sum;
    }

    // create a method that takes a list and returns it's average
    public static double averageOfDoubleList(ArrayList<Double> doubleArrayList){
        double averageOfDoubleList = 0;
        for (int i = 0; i < doubleArrayList.size(); i++) {
            averageOfDoubleList = sumOfTheDoubleList(doubleArrayList) / doubleArrayList.size();
        }
        return averageOfDoubleList;
    }

    // create a method that return index of the biggest number
    // public static int max(ArrayList<Double> list)
    public static int max(ArrayList<Double> list) {
        Double max = list.get(0);
//        for (Double element : list){
//            if (element > max){
//                max = element;
//            }
//        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max){
                max = list.get(i);
            }
        }
        return list.indexOf(max);
    }
}

