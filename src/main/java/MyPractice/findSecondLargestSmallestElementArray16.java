package MyPractice;

public class findSecondLargestSmallestElementArray16 {
    public static void main(String[] args) {


        int arr[] = {8, 2, 5, 7, 10, 32};
        int temp, size;
        size = arr.length;
        System.out.println("Array size is " + size);

        secondLargestElement(arr, size, 2);
    }

    private static int[] secondLargestElement(int[] arr, int size, int numberOfLargerSize) {
        int temp;
        for(int i = 0; i < size; i++){
            for (int j = i+1; j < size; j++) {
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of Array in ascending order");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Second Largest Number is " + arr[size - numberOfLargerSize]);
        return arr;
    }
}
