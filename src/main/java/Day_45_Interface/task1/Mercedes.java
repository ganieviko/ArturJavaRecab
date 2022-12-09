package Day_45_Interface.task1;

public class Mercedes extends Car implements Diesel{
    public Mercedes(String model, int year) {
        super(model, year);
    }

    @Override
    public void changeOil() {
        System.out.println("Change oil every 50 000 miles");
    }
}
