package Day_44_AbstractKeyword.task2;

public abstract class Salad extends Food{
    public abstract void madeIn();

    @Override
    public void taste() {
        System.out.println("Fresh, salty, sour");
    }
}
