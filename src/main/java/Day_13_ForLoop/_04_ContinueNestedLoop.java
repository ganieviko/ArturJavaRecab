package Day_13_ForLoop;

public class _04_ContinueNestedLoop {
    public static void main(String[] args) {

        int weeks = 3;
        int days= 7;

        // outer loop
        for (int i = 1; i <=weeks ; i++) {
            System.out.println("Weeks: " + i);

            // inner loop
            for (int j = 1; j <= days; j++) {

                // continue inside the inner loop
                if (j % 2 != 0){
                    continue;
                }
                System.out.println("    Days: " + j);
            }
        }
    }
}
