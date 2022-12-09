package Day_44_AbstractKeyword.abstractKeyword;

public class Demo {
    public static void main(String[] args) {
//        AbstractClass object = new AbstractClass();
        AbstractClass object = new Child();
        object.abstractMethod();
    }
}
