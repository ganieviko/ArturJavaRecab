package Day_46_GameCreating.game.entities.good;

import Day_46_GameCreating.game.entities.Good;
import Day_46_GameCreating.game.weapons.Sword;

public class Knight extends Good {
    public Knight(){
        health = 8;
        weapon = new Sword();
    }
    @Override
    public int doDamage() {
        return 5;
    }
}
