package Day_33_GIT.task2;

public class Alternative {
    public static void main(String[] args) {
        String command = args[0];

        int sum = 0;
        for (int i = 1; i < args.length; i++) {
            int number = Integer.parseInt(args[i]);
            sum+=number;

        }
        if (command.equals("sum")){
            System.out.println(sum);
        } 
        if (command.equals("overage")){
            System.out.println(sum/ (args.length -1));
        }
    }
}
