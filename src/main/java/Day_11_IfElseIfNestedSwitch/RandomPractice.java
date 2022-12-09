package Day_11_IfElseIfNestedSwitch;

import java.util.Random;

public class RandomPractice {
    public static void main(String[] args) {
        Random rn = new Random();

        for(int i =0; i < 100; i++)
        {
            int answer = rn.nextInt(6);
            System.out.println(answer);
        }
    }
}
