package Day_47_AbstractionCoffeeMachine.CoffeeMachine;

public class CoffeeMachine {
    private BrewingUnit brewingUnit;
    private CoffeeStorageUnit coffeeStorageUnit;
    private CupDispenser cupDispenser;
    private Grinder grinder;

    public CoffeeMachine(){
        brewingUnit = new BrewingUnit();
        coffeeStorageUnit = new CoffeeStorageUnit();
        cupDispenser = new CupDispenser();
        grinder = new Grinder();
    }

    public void switchOn(){
        brewingUnit.checkStatus();
        coffeeStorageUnit.checkStatus();
        cupDispenser.checkStatus();
        grinder.checkStatus();
    }

    public void selectCoffee(){
        System.out.println("Selecting Coffee");
        coffeeStorageUnit.dispenseCoffeeBean();
        grinder.grind();
        brewingUnit.brew();
        cupDispenser.dispenseCup();
    }

    public void refill(){
        coffeeStorageUnit.refill();
        grinder.checkStatus();
        brewingUnit.changeHeatingUnit();
        cupDispenser.refill();
    }
}
