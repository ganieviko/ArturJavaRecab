package Day_11_IfElseIfNestedSwitch;

public class _03_NestedIf {
    public static void main(String[] args) {
        boolean condition1 = true;
        boolean condition2 = false;

        if (condition1){
            System.out.println("condition 1 is true");
            if (condition2){
                    System.out.println("condition 2 is true");
            }else {
                System.out.println("condition 2 is false");
            }
        }else {
            System.out.println("condition 1 is false");
        }
    }
}
