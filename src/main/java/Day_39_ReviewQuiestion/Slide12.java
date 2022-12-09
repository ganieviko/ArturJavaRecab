package Day_39_ReviewQuiestion;

public class Slide12 {
    int instanceVariable = 1;

    public static void main(String [] args){
        Slide12 instance = new Slide12();
        instance.method();
        System.out.println(instance.instanceVariable);
        if (true){
            int anotherLocalVariable = 1;
        }
//        anotherLocalVariable;
        int localVar = instance.returnLocalVar();
        System.out.println(localVar);
    }

    public void method(){
        int localVar = 1;
        System.out.println(instanceVariable);
    }

    public int returnLocalVar(){
        int localVar = 1;
        return localVar;
    }
}
