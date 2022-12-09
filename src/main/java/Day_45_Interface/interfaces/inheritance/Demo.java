package Day_45_Interface.interfaces.inheritance;

public class Demo {
    public static void main(String[] args) {
        ExampleClass object = new ExampleClass();
        ChildInterface childReference = object;
        childReference.method2();
        ParentInterface parentInterface =object;
        AnotherParentInterface anotherParentInterface = object;

    }
}
