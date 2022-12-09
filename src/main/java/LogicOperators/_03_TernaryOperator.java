package LogicOperators;

public class _03_TernaryOperator {
    public static void main(String[] args) {
        boolean condition = false;

        String result = condition ? "first" : "second";

        // shorter version of IF ELSE STATEMENT with assignment, it also called elvis

//        if(condition){
//            result = "first";
//        }else {
//            result = "second";
//        }
        System.out.println(result);
    }
}
