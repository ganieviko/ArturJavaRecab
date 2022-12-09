package Day_45_Interface.interfaces;

public class ExampleClass extends ParentClass implements ExampleInterface {
    @Override
    public void method1() {
        System.out.println("Hello");
    }

    @Override
    public int method2() {
        return 0;
    }
}
