package Day_46_GameCreating;

import Day_46_GameCreating.game.Attack;
import Day_46_GameCreating.game.weapons.Weapon;

public abstract class Entity implements Attack , Comparable<Entity> {
    protected int health;
    protected Weapon weapon;

    public boolean isDead(){
        return health <= 0;
    }

    public abstract void fight(Entity another);

    public void takeDamage(Attack o) {
        health = health - o.doDamage();
    }

    @Override
    public String toString() {
        return "Entity{" +
                "entity=" + this.getClass().getSimpleName()+
                "health=" + health +
                '}';
    }

    @Override
    public int compareTo(Entity anotherEntity){
        // if this less than another then return < 0
        // if this more than another then return > 0
        // if this equal than another then return = 0
        return this.health - anotherEntity.health;
    }
}
