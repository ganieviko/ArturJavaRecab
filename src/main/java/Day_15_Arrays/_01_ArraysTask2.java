package Day_15_Arrays;

public class _01_ArraysTask2 {
    // declare an array of fruits and initialize it with some values use array = {}
    // print all elements
    // part 2: make a copy of that array
    public static void main(String[] args) {

        String[] fruits = {"Orange", "Banana", "Kiwi", "Apple", "Mango", "Mandarin"};
        
        // step 0: declare a variable of the same type as the array
        String [] copyOfFrits;

        // step 1: init the copy with the same size
        copyOfFrits = new String[fruits.length];

        // step 2: iterate over the array and assign each element one by one

        System.out.println("List of vegetable ArraysClass: ");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
            copyOfFrits[i] = fruits[i]; // copying the value with the same index
        }
        fruits[1] = "not fruit"; // this will not change the value of second element inside copyOfFrits

        System.out.println();

        System.out.println("copyOfFrits content:");
        for (int i = 0; i < copyOfFrits.length; i++) {
            System.out.println(copyOfFrits[i] + " ");
        }

        System.out.println();
        System.out.println("Coping by reference");
        String[] copyByReference = fruits; // after copying
        fruits[2] = "not fruit"; // this will change the value of third element inside copyByReference
        for (int i = 0; i < copyOfFrits.length; i++) {
            System.out.println(copyByReference[i]);

        }
    }
}
