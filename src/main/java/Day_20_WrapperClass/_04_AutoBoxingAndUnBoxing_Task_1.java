package Day_20_WrapperClass;

public class _04_AutoBoxingAndUnBoxing_Task_1 {
    // autobox and unbox all the values below
    public static void main(String[] args) {
        byte primitiveByte = 127;
        Byte aByte = primitiveByte; // autoboxing
        byte unboxedByte = aByte;   // unboxing

        short primitiveShort = 1113;
        Short aShortAutoboxed = primitiveShort;
        short unboxedShort = aShortAutoboxed;

        int primitiveInteger = 10003;
        Integer integerAutoboxed = primitiveInteger;
        int unboxedInt = integerAutoboxed;

        long primitiveLong = 153369L;
        Long longAutoboxed = primitiveLong;
        long unboxedLong = longAutoboxed;

        float primitiveFloat = 23423423F;
        Float floatAutoboxed = primitiveFloat;
        float unboxedFloat = floatAutoboxed;

        double primitiveDouble = 23.5;
        Double doubleAutoboxed = primitiveDouble;
        double unboxedDouble = doubleAutoboxed;

        boolean primitiveBoolean = true;
        Boolean booleanAutoboxed = primitiveBoolean;
        boolean unboxedBoolean = booleanAutoboxed;

        char primitiveChar = 'A';
        Character aCharacter = primitiveChar;
        char unboxedChar = aCharacter;

//        Character aNullCharacter = null;
//        char unboxedNullChar = aNullCharacter;
//        System.out.println(unboxedNullChar); //NullPointerException
    }
}
