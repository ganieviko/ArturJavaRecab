package Day_20_WrapperClass;

public class _04_AutoBoxingAndUnBoxing {
    public static void main(String[] args) {
        byte primitiveByte = 127;
        Byte aByte = primitiveByte; // autoboxing
        byte unboxedByte = aByte;   // unboxing
        Short shortWrap = 1113;
        Integer integerWrap = 10003;
        Long longWrap = 153369L;
        Float floatWrap = 23423423F;
        Double doubleWrap = 23.5;
        Boolean booleanWrap = null;
        Character characterWrap = 'g';
    }
}
