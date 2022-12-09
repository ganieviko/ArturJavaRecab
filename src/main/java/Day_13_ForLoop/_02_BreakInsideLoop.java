package Day_13_ForLoop;

public class _02_BreakInsideLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i == 5){
                break;
            }
            System.out.println(i); // when i = 5 this part is never executed, because  we exit
        }
    }
}
