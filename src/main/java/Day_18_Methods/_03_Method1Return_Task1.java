package Day_18_Methods;

public class _03_Method1Return_Task1 {
    // create a method that takes two numbers and return their product
    // in main method call this method and print the result as "the product of two numbers is"

    public static void main(String[] args) {
        int sumOfTwoNumber = productOfTwoNumbers(5, 90);
        System.out.println("the product of two numbers is: " + sumOfTwoNumber);
    }

    public static int productOfTwoNumbers(int number1, int number2){
        return number1 * number2;
    }
}
