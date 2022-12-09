package Day_42_Overriding.overriding;

import java.time.LocalDate;

public class Child extends Parent{

    @Override
    public int calculateAge(LocalDate dob){
        return 1;
    }
}
