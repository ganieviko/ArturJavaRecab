package Day_13_ForLoop;

public class _04_Task1 {
    // print a square 4x4 wide out of '*' character
    // ****
    // ****
    // ****
    // ****
    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++) {
            System.out.print("Row " + i);
            for (int j = 1; j <=4 ; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
