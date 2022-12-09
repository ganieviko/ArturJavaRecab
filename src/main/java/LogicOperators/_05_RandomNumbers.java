package LogicOperators;

import java.util.Random;

public class _05_RandomNumbers {
    public static void main(String[] args){

        int max = 89;
        int min = 5;

        int randomNumber = (int)(Math.random() * ((max - min ) + 1)) + min;
        System.out.println(randomNumber);

        Random random = new Random();
//        radon.nextInt(bound) this function returns a random int between 0 and bound
        int randomNumber2 = random.nextInt(max - min) + min ; // between 5 and 89
        System.out.println(randomNumber2);

        random.nextDouble();
        double randomDouble = random.nextInt(max - min) + min;
        System.out.println(randomDouble);
    }
}
