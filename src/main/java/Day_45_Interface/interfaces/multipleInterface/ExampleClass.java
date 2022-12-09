package Day_45_Interface.interfaces.multipleInterface;

public class ExampleClass implements InterfaceWithVariable, AnotherInterfaceWithVariable{
    public int method(){
        System.out.println(variable1);
        System.out.println(InterfaceWithVariable.PI);
        return 0;
    }
}
