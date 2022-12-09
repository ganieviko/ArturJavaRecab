package YusufMentoring;

public class Quiz {
    public static void main(String[] args) {
        B obj = new B();
        obj.a = obj.b;
        obj.b = obj.a;
        System.out.println(obj.a+" ");
        System.out.println(obj.b);
    }
}
