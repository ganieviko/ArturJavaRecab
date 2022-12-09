package Day_48_OOPReview.inheritance;

public class SubClass extends SuperClass{
    public SubClass(){
        super(1,2);
    }

    void method(){
        System.out.println(getA());
        System.out.println(b);
    }
}
