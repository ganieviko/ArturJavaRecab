package Day_37_Exception_Part2.task2TeacherWay.task2;

public class Car {

    public void buy(CarCondition condition) throws Exception {
      if (condition == CarCondition.OLD){
          throw new Exception("SimpleCar too OLD!");
      }if (condition == CarCondition.WASTE){
          throw new Exception("SimpleCar is WASTED");
        }
    }

    public void drive(String weather) {
        if (!weather.equals("normal")){
            throw new RuntimeException("You cannot drive in this weather");
        }
    }
}
