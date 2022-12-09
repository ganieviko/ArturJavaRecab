package Day_24_Collections;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task1_TeacherWay {
    // create a method that takes 3 arguments: length number, min number, max number
    // return a list of provided length, and fill it with random numbers generated from min to max

    // part2: create a list of 5 lists of random numbers, each list should be of 5 length and random number from 1 to 5

    // part3: create a list of 5 numbers gotten from the user input
    // check of your list of lists contains the user list, if yes print "you guessed correctly", if no print "you lose"

    public static ArrayList<Integer> generateRandomList (Integer length, Integer minNUmber, Integer maxNumber){
        ArrayList<Integer> result = new ArrayList<>();
        Random generator = new Random();
        for (int i = 0; i < length; i++) {
            Integer randomNumber = minNUmber + generator.nextInt(maxNumber + 1 - minNUmber);
            result.add(randomNumber);
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(arrayList);
        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ArrayList<Integer> arrayList = generateRandomList(5, 4, 9);
            listOfLists.add(arrayList);
        }
        System.out.println(listOfLists);


        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> userList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            userList.add(scanner.nextInt());
        }
        System.out.println(userList);

        if (listOfLists.contains(userList)){
            System.out.println("you guessed correctly");
        }else {
            System.out.println("you lose");
        }
        System.out.println(listOfLists);
    }
}
