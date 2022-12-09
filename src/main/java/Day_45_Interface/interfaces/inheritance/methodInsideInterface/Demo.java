package Day_45_Interface.interfaces.inheritance.methodInsideInterface;

public class Demo {
    public static void main(String[] args) {
        SimpleClass object = new SimpleClass();
        object.defaultMethod();
        // static method not inherited from interface
        SimpleInterface.staticMethod();
    }
}
