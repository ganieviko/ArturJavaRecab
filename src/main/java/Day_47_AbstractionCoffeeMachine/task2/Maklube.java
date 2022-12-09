package Day_47_AbstractionCoffeeMachine.task2;

public class Maklube extends Food{
    private void fry(){}
    private void design(){}
    private void boil(){}

    @Override
    public void cook() {
        boil();
        fry();
        design();
    }
}
