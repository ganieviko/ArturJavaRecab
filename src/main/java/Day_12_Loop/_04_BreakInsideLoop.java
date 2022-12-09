package Day_12_Loop;

public class _04_BreakInsideLoop {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10){
            count++;
            System.out.println(count);
            if (count == 5) {
                break;
            }
        }
    }
}
