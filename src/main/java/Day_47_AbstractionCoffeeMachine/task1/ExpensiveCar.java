package Day_47_AbstractionCoffeeMachine.task1;

public class ExpensiveCar implements Car{
    private Engine engine;
    private Engine secondEngine;
    private BreakingSystem breakingSystem;
    private Transmission transmission;

    public ExpensiveCar(){
        engine = new Engine();
        secondEngine = new Engine();
        breakingSystem = new BreakingSystem();
        transmission = new Transmission();
    }

    public void start(){
        engine.start();
        transmission.changeGears();
        secondEngine.start();
    }

    public void drive(){
        transmission.changeGears();
    }

    public void stop(){
        secondEngine.stop();
        breakingSystem.startBreaking();
        engine.stop();
    }
}
