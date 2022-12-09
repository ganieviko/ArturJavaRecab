package Day_44_AbstractKeyword.task2;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cafe {
    public static void main(String[] args) {
        List<Food> list = getRandomlyGeneratedFoods(); // size 3 up to 8
        Random random = new Random();
        for (int i = 0; i < 40; i++) {
            int randomFood = random.nextInt(list.size());
            Food food = list.get(randomFood);
            food.taste();
            food.madeIn();
            System.out.println("---------");
        }

    }

    private static List<Food> getRandomlyGeneratedFoods() {
        List<Food> list = new ArrayList<>();
        Random random = new Random();
        final int count = random.nextInt(6) + 3; // 3 up to 8 foods
        for (int i = 0; i < count; i++) {
            // decide what kind of food to add to list
            final  int foodIndex = random.nextInt(4);

            switch (foodIndex){
                case 0:
                    list.add(new Baklava());
                    break;
                case 1:
                    list.add(new CheeseCake());
                    break;
                case 2:
                    list.add(new CezarSalad());
                    break;
                case 3:
                    list.add(new GreekSalad());
                    break;
            }
        }

        return list;
    }
}
