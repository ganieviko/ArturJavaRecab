package Day_47_AbstractionCoffeeMachine.nested;

public class Dog {
    private String name;
    private String breed;
    private Collar collar;

    public static class Collar {
        String nameTag;
        String serialNumber;
    }

    interface Play {
        void play();
    }
}
