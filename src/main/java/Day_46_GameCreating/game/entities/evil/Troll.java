package Day_46_GameCreating.game.entities.evil;

import Day_46_GameCreating.game.entities.Evil;
import Day_46_GameCreating.game.weapons.Sword;

public class Troll extends Evil {
    public Troll(){
        health = 10;
        weapon = new Sword();
    }
    @Override
    public int doDamage() {
        return 7;
    }
}
