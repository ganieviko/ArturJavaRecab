package MyPractice;

import java.util.Arrays;

public class AddingElementToArray {
    public static void main(String[] args) {
        int n = 10;
        int i;

        // initial array of size 10
        int arr[]
                = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // print the original array
        System.out.println("Initial Array:\n"
                + Arrays.toString(arr));

        // element to be added
        int x = 50;
        // call the method to add x in arr
        arr = addArrayElements(n, arr, x);

        // print the updated array
        System.out.println("\nArray with " + x + " added:\n" + Arrays.toString(arr));
    }
    // Function to add x in arr
    public static int[] addArrayElements(int n, int arr[], int x) {
        int i;

        // create a new array of size n+1
        int newarr[] = new int[n + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till n
        // then insert x at n+1
        for (i = 0; i < n; i++) {
            newarr[i] = arr[i];
            newarr[n] = x;
        }
        return newarr;
    }
}
