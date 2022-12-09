package Day_14_NestedLoop;

public class _03_Debugging {
    public static void main(String[] args) {
        int number = 1;
        System.out.println(number);
        ++number;
        System.out.println(number);
        if (number > 1){
            System.out.println("larger then 1");
        }else {
            System.out.println("less then 1");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
        System.out.println("after the loop");
    }
}
