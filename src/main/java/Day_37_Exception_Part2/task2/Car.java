package Day_37_Exception_Part2.task2;

public class Car {

    public void buy(CarCondition condition) throws Exception {
       switch (condition){
           case OLD:
               throw new Exception("The car is too OLD!");

           case WASTE:
               throw new Exception("The car is a waste!");
       }
    }

    public void drive(String weather) throws RuntimeException {
        if (!weather.equals("normal")){
            throw new RuntimeException("You cannot drive in this weather");
        }
    }
}
