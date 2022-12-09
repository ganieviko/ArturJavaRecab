package Day_37_Exception_Part2.task2TeacherWay.task2;

public class Demo {
    public static void main(String[] args) {
        Car toyota = new Car();

        try {
            toyota.buy(CarCondition.OLD);
        } catch (Exception e) {
            e.printStackTrace();
        }

        toyota.drive("snow");
    }
}
