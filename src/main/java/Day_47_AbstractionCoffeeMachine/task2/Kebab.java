package Day_47_AbstractionCoffeeMachine.task2;

public class Kebab extends Food{
    private void marinade(){}
    private void grill(){}

    @Override
    public void cook() {
        marinade();
        grill();
    }
}
