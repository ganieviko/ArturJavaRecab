package Day_45_Interface.interfaces;

public class Demo {
    public static void main(String [] args){
        ExampleInterface variable1 = new MultipleInheritanceExampleClass();
        variable1.method1();
        variable1.method2();
        AnotherInterface variable2 = new MultipleInheritanceExampleClass();
        variable2.method3();
        variable2.method4();

        System.out.println(InterfaceWithVariable.variable1);
    }
}
