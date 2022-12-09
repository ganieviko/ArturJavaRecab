package Day_20_WrapperClass;

public class _03_WrapperClasses {
    public static void main(String[] args) {
        int primitiveInt = 1;
//        primitiveInt. // no methods for primitive
        Integer nonPrimitive = 1;
        String string = nonPrimitive.toString(); // wrapper classes has methods
        System.out.println(string);

        // int cannotAssignNull = null;
        Integer canAssignNull = null;


        int[] intArray = new int[2];
        System.out.println(intArray[0]); // always has a value
        System.out.println(intArray[1]);

        Integer[] nonPrimArray = new Integer[6];
        System.out.println(nonPrimArray[0]); // can be null
        System.out.println(nonPrimArray[1]);
        System.out.println(nonPrimArray[2]);

        String aNullString = null;
        String aNotNull = "Another string";
//        System.out.println(aNullString.concat(aNotNullString)); //NullPointerException
        System.out.println(aNullString + aNotNull); // with + concatenation there's no null pointer
        System.out.println(aNotNull + aNullString); // with + concatenation there's no null pointer
    }
}
