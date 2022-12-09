package Day_29_StaticKeyword;

public class CarWithStaticMethods {
    public String name;
    public static int total;

    static {
        System.out.println("executing static bloc");
        total = 15;
//        name = "Techno Study"; cannot access instance variable
    }
    public static void print(){
        System.out.println("This is a static method");
        print2();
//        printInstance(); this gives error, because we cannot call instance method from static method

        CarWithStaticMethods car = new CarWithStaticMethods();
        car.printInstance();

        System.out.println(total); // static variable available
//        System.out.println(name); // instance variable is not available

    }

    public void printInstance(){
        System.out.println("This is an instance method");
        print2(); // can call static method
        printInstance2(); // can call an instance method

        System.out.println(total); // static variable available
        System.out.println(name); // instance variable available
    }

    public static void print2(){
        System.out.println("This is another static method");
    }

    public void printInstance2(){
        System.out.println("This is another instance method");
    }
}
