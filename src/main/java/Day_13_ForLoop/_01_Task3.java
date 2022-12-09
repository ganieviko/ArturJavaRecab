package Day_13_ForLoop;

public class _01_Task3 {
    //write a java program which calculates the sum from [0 to 5]
    // using for-loop
    public static void main(String[] args) {
             int sum =0;
        for (int i=0; i<=5; i++){
            sum+= i;
            System.out.println("number i each iteration " + i);
        }
        System.out.println();
        System.out.println("Total sum is " + sum);
    }
}
