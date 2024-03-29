package Day_46_GameCreating.game.entities;

import Day_46_GameCreating.Entity;

import java.util.Random;

public abstract class Good extends Entity {
    public void fight(Entity another) {
        if (another instanceof Good || this.isDead()) {
            return;
        }
        System.out.print(this.getClass().getSimpleName() + " is attacking: " + another.getClass().getSimpleName() + " ");
        boolean bareHands = new Random().nextBoolean();
        if (bareHands){
            another.takeDamage(this);
        }else {
            another.takeDamage(this.weapon);
        }
        //
        // counter-attack
        this.takeDamage(another);
    }
}
