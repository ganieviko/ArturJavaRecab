package Day_13_ForLoop;

public class _04_NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
            for (int j = 0; j < 5; j++) {
                System.out.println("    j:" + j);
            }
        }
    }
}