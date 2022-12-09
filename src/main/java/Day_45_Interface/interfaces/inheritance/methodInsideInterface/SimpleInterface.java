package Day_45_Interface.interfaces.inheritance.methodInsideInterface;

public interface SimpleInterface {
    default void defaultMethod(){
        System.out.println("Default Method");
    }

    static void staticMethod(){
        System.out.println("Static Method");
    }
}
