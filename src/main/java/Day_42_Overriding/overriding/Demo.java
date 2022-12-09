package Day_42_Overriding.overriding;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Demo {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.calculateAge(LocalDate.now()));

    }
}

