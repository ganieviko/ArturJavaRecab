package MyExplanation;

public class IfElseIf {
    static public void main(String []args){

        // if statement check condition of statement, if condition is true it execute block of code
        // if - else also test condition. It executes the if block, if condition is true otherwise it executes else block
        // of - else if ladder statements executes one condition from multiple statements.

        boolean condition1 = false;
        boolean condition2 = true;
        if (condition1){
            System.out.println("condition1 is true");
        }else if (condition2){
            System.out.println("condition2 is true");
        }else {
            System.out.println("condition1 and condition2 is false");
        }
    }
}
