package Day_11_IfElseIfNestedSwitch;

public class _02_SwitchCase {
    public static void main(String[] args) {
        int randomNumber = 1;

        switch (randomNumber){ // the switch statement will only check foe equality of cases below
            case 1:
                System.out.println("The number is 1");
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            case 3:
                System.out.println("The number is 3");
                break;
            default:
                System.out.println("No numbers matched");
                break;
        }
    }
}
