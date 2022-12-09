package LogicOperators;

public class _01_IfElse {
    public static void main(String[] args) {
        boolean someCondition = false;

        if (someCondition) // depending on these conditions either block1 or block 2 will be executed
        { // block 1
            System.out.println("The statement is true");
            System.out.println("The statement is true");
            System.out.println("The statement is true");
        }
        else
        { // block 2
            System.out.println("The statement is false");
            System.out.println("The statement is false");
            System.out.println("The statement is false");
        }
    }
}
