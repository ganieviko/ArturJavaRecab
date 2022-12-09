package Day_22_Recab_methodAnd2DArrays;

public class RecapTask2 {
    // create a method that accepts undefined(any) number of integers
    // count how many of them starts with 1 and ends with 0
    // return the count
    public static void main(String[] args) {
        int result = intNumbers(12, 120, 150, 57);
        System.out.println(result);
    }

    public static int intNumbers(int... listOfIntegers){
        int result  = 0;
        for (int i = 0; i < listOfIntegers.length; i++) {
            int element = listOfIntegers[i];

            String stringElement = "" + element;
            if (stringElement.startsWith("1") && stringElement.endsWith("0")){
                result++;
            }
        }
        return result;
    }
}
