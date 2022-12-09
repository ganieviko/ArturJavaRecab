package Day_20_WrapperClass;

public class Task1 {
    // create a method that accepts an int
    // and returns twice of that int
    // overload this method with wrapper class Integer
    // input 2, output 4

    public static void main(String[] args) {
        twiceTheValue(24);
        Integer number = 2;
        twiceTheValue(number);
        System.out.println(twiceTheValue(24));
        System.out.println(twiceTheValue(number));
    }

    public static int twiceTheValue(int intNumber){
        System.out.println("1st method");
     return intNumber * 2;
    }

    public static Integer twiceTheValue(Integer number){
        System.out.println("2nd method");
        return number * 2;
    }
}
