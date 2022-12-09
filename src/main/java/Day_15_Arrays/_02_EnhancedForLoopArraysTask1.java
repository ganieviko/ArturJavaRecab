package Day_15_Arrays;

public class _02_EnhancedForLoopArraysTask1 {

    // given the provided array
    // print the length of each string element
    public static void main(String[] args) {
        String[] list = {"fruits", "vegetables", "meet", "milk"};

        for (String element : list){ // the index and array length is handled by Java
//            int length = element.length();
////            System.out.println(length);
////            System.out.println("------------------");
            System.out.println(element + " " + element.length());
        }

        System.out.println();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " " + list[i].length());

        }
    }
}
