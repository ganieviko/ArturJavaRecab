package Day_46_GameCreating.game.entities.good;

import Day_46_GameCreating.game.entities.Good;
import Day_46_GameCreating.game.weapons.Bow;

public class Archer extends Good {
    public Archer(){
        health = 5;
        weapon = new Bow();
    }
    @Override
    public int doDamage() {
        return 3;
    }
}
