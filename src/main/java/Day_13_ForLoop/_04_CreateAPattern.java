package Day_13_ForLoop;

public class _04_CreateAPattern {
    public static void main(String[] args) {

        int row =5;

        //outer loop
        for (int i = 1; i <=row ; i++) {

            //inner loop to print the numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
