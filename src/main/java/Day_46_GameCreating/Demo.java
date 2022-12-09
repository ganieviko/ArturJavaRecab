package Day_46_GameCreating;

import Day_46_GameCreating.game.entities.Evil;
import Day_46_GameCreating.game.entities.Good;
import Day_46_GameCreating.game.entities.evil.Skeleton;
import Day_46_GameCreating.game.entities.evil.Troll;
import Day_46_GameCreating.game.entities.good.Archer;
import Day_46_GameCreating.game.entities.good.Knight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        List<Entity> entities = generateRandomEntities();
        Collections.sort(entities);
        print(entities);
        // one round of the game
        for (Entity entity : entities) {
            for (Entity another : entities) {
                entity.fight(another);
            }
            System.out.println();
        }

        checkWhoWins(entities);
    }

    private static void print(List<Entity> entities) {
        for (Entity entity : entities){
            System.out.println(entity);
        }
    }

    private static void checkWhoWins(List<Entity> entities) {
        int totalNumberOfEvils = 0;
        int totalNumberOfGood = 0;
        int evilsDead = 0;
        int goodsDead = 0;
        for (Entity entity : entities) {
            if (entity instanceof Evil) {
                totalNumberOfEvils++;
                if (entity.isDead()) {
                    evilsDead++;
                }
            }
            if (entity instanceof Good) {
                totalNumberOfGood++;
                if (entity.isDead()) {
                    goodsDead++;
                }
            }
        }
        // check who is dead
        if (totalNumberOfEvils == totalNumberOfGood && totalNumberOfGood == goodsDead) {
            throw new RuntimeException("This should not happen!");
        }
        if (totalNumberOfEvils == evilsDead) {
            System.out.println("Good wins!");
        }
        if (totalNumberOfGood == goodsDead) {
            System.out.println("Evil wins!");
        }
    }

    private static List<Entity> generateRandomEntities() {
        Random random = new Random();
        List<Entity> generated = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int randomEntity = random.nextInt(4);
            switch (randomEntity) {
                case 0:
                    generated.add(new Skeleton());
                    break;
                case 1:
                    generated.add(new Troll());
                    break;
                case 2:
                    generated.add(new Knight());
                    break;
                case 3:
                    generated.add(new Archer());
                    break;
            }
        }
        return generated;
    }
}
