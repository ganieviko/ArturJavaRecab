package Day_12_Loop;

public class _01_WhileLoopV2 {
    public static void main(String[]args){
        boolean condition = true;
        int count = 0;

        while (condition){ // while condition is true, repeat the block below
            ++count;        // 1 2 3 4 5
            System.out.println(count);

            if (count == 5 ){
                condition = false;
            }
        }




    }
}
