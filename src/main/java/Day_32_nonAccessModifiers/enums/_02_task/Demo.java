package Day_32_nonAccessModifiers.enums._02_task;

public class Demo {
    public static void main(String[] args) {
        Month currentMonth = Month.Dec;
        System.out.println(currentMonth);
        System.out.println(currentMonth.fullName);
        currentMonth.printFirstLetter();
    }
}
