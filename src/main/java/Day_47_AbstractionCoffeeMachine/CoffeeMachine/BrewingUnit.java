package Day_47_AbstractionCoffeeMachine.CoffeeMachine;

public class BrewingUnit {

    public void brew(){
        System.out.println("Brew!!!");
        pourWater();
        heatUp();
        checkTemperature();
    }

    public void checkStatus(){
        System.out.println("Checking status!!!");
    }

    public void changeHeatingUnit(){}

    private void heatUp(){}
    private void checkTemperature(){}
    private void pourWater(){}

}
