package Day_15_Arrays;

public class _02_EnhancedForLoopArrays {
    public static void main(String[] args) {
        String[] list = {"fruits", "vegetables", "meet", "milk"};

        for (String element : list){ // the index and array length is handled by Java
            System.out.println(element);
        }
//        System.out.println(element); // not available outside
    }
}
