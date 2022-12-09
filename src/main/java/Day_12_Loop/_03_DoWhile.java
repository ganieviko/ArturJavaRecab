package Day_12_Loop;

public class _03_DoWhile {
    public static void main(String[] args) {
        int count = 0;

        do {    // the block is guaranteed to execute at least once
            ++count;
            System.out.println( "This is Do-While " + count);
        } while (count < 5);    // the condition check is after

        System.out.println();
        int count2 = 10;
        while (count2 < 5){     // the condition check is before
            ++count2;
            System.out.println(count2);
        }
    }
}
