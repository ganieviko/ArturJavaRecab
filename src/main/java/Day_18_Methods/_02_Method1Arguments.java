package Day_18_Methods;

public class _02_Method1Arguments {

    public static void sayHello(String name, int numberOfIteration){

        for (int i = 0; i < numberOfIteration; i++) {
            System.out.println("Hello " + name + "!");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        sayHello("Artur", 1);
        sayHello("Dauke", 2);
        sayHello("Techno", 5);
    }
}
