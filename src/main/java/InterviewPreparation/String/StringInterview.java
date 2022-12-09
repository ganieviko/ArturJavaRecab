package InterviewPreparation.String;

public class StringInterview {
    public static void main(String[] args){
        String a = "hello"; // String literal
        String b = "hello";
        String world = a.concat("world"); //immutable

        System.out.println(world);
        System.out.println(a.concat("World"));

        String s = new String("hello");
        String s1 = new String("hello");
        System.out.println(a == b);
        System.out.println(a == s);
        System.out.println(s == s1);

        //StringBuffer and StringBuilder --> are Mutable
        StringBuffer sb = new StringBuffer("hello");
        sb.append(" Artur");
        int a1 = sb.indexOf("A");
        System.out.println(a1);
        System.out.println(sb);

        //StringBuilder is not thread safe. It is Non Synchronized
    }
}
