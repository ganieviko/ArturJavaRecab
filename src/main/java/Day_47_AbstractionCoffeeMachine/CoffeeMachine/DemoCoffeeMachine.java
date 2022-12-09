package Day_47_AbstractionCoffeeMachine.CoffeeMachine;

public class DemoCoffeeMachine {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();

        machine.switchOn();
        machine.selectCoffee();
    }
}
