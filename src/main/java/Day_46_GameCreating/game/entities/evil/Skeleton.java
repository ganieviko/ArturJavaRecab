package Day_46_GameCreating.game.entities.evil;

import Day_46_GameCreating.game.entities.Evil;
import Day_46_GameCreating.game.weapons.Bow;

public class Skeleton extends Evil {
    public Skeleton(){
        health = 3;
        weapon = new Bow();
    }
    @Override
    public int doDamage() {
        return 2;
    }
}
