package TubaMentoring;

public class _While_Task2 {
     /*
        Find the square of the numbers between 1 and 7
        1 4 9 16 25 36 49
         */
     public static void main(String[] args) {

         int minNumber = 1;
         int maxNumber = 7;
         while (minNumber <= maxNumber){
            int square = minNumber*minNumber;
             System.out.println(square);
             minNumber++;
         }

     }
}
