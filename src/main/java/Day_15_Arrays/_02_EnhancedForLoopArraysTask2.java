package Day_15_Arrays;

public class _02_EnhancedForLoopArraysTask2 {

    // given the provided array
    // find out the index at which String starts with "m"
    public static void main(String[] args) {
        String[] list = {"milk", "fruits", "vegetables", "meet", "milk"};

        for (int i = 0; i < list.length; i++) {
            if (list[i].startsWith("m")){
                System.out.println(i);
            }
        }
        for (String element : list){
            if (element.startsWith("m")){
                System.out.println("This element start with m: " + element); // don't have reference to index
            }
        }
    }
}
