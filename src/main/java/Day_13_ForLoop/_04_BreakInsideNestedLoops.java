package Day_13_ForLoop;

public class _04_BreakInsideNestedLoops {
    public static void main(String[] args) {

        int weeks = 3;
        int days = 7;

        //outer loop
        for (int i = 1; i <= weeks; i++) {
            System.out.println("Week: " + i);

            //inner loop
            for (int j = 1; j <=days; j++) {

                // break inside the inner loop
                if (i == 2){
                    break;
                }
                if (j == 2){
                    break;
                }
                System.out.println("    Days " + j);
            }
        }
    }
}
