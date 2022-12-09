package Day_13_ForLoop;

public class _03_ContinueLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print("-> ");
            if (i == 5){
                System.out.println();
                continue;
            }
            System.out.println(i);  // when i = 5, then this part of code is skipped,
                                    // because we are jumping to the next iteration
        }
    }
}
