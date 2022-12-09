package Day_48_OOPReview.task2Encapsulation;

public class Demo2 {
    public static void main(String[] args) {
        int[][] array = new int[2][6];
            try {
                Matrix m = new Matrix(array);
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        int element = array[i][j];
                        System.out.print(i + ":" + j + " -> " + element + " ");
                    }
                    System.out.println();
                }
            } catch (MatrixException e) {
                e.printStackTrace();
            }
        }
    }

