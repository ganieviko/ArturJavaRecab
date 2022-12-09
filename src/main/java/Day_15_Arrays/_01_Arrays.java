package Day_15_Arrays;

public class _01_Arrays {
    public static void main(String[] args){
        int variable1; // declaration
        int variable2; // declaration

        int[]array; // declaration of an arrays of variables

        array = new int[10]; // initialization of array by provide and number of elements

        System.out.println(array[0]);

        int secondValue = array[1]; // second element

        System.out.println(secondValue);

        array[2] = 12123; // third element

        System.out.println(array[2]);

        double[] myList = new double[5];  // declaration and initialization in one line

        System.out.println(myList[0]);

        myList[0]= 0.14114;
        System.out.println(myList[0]);

        String [] aList = new String[4];                                       // the size is 4, but the indexes are from 0 to 3
        String [] listOfVegetable = {"carrot", "Onion", "Potato", "Cabbage",}; // a way to initialize array with initial values
        System.out.println(listOfVegetable[1]);
//        System.out.println(listOfVegetable[4]); will throw ArrayIndexOutOfBoundsException

        for(String i : listOfVegetable){
            System.out.println("Artur for " + i);
            System.out.println("Artur using toString " + i);
        }

        System.out.println(listOfVegetable); // prints object reference of an array
        System.out.println(array);
        System.out.println(myList);

        System.out.println(listOfVegetable.length);
        System.out.println(array.length);
        System.out.println(myList.length);

        System.out.println("---------------------");

//        System.out.println(listOfVegetable[0]);
//        System.out.println(listOfVegetable[1]);
//        System.out.println(listOfVegetable[2]);
//        System.out.println(listOfVegetable[3]);

        for (int i = 0; i < listOfVegetable.length; i++) {
            System.out.println(listOfVegetable[i]);
        }
        System.out.println();
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + ", ");

        }
    }
}
