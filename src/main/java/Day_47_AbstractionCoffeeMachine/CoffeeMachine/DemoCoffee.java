package Day_47_AbstractionCoffeeMachine.CoffeeMachine;

public class DemoCoffee {
    public static void main(String[] args) {
        CoffeeStorageUnit unit = new CoffeeStorageUnit();
        unit.refill();
        unit.dispenseCoffeeBean();

        Grinder grinder = new Grinder();
        grinder.grind();

        BrewingUnit brewingUnit = new BrewingUnit();
        brewingUnit.brew();

        CupDispenser cupDispenser = new CupDispenser();
        cupDispenser.dispenseCup();
    }
}
