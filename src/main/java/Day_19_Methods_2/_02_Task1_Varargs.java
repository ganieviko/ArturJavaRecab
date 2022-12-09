package Day_19_Methods_2;

public class _02_Task1_Varargs {
    //create method that calculates average of given student result
    // inputs: name and results
    // ex: Ali, 30, 40, 90, 100
    /// Ali : 65
    // ex: Bali, 30, 40, 90, 100, 95, 86
    /// Bali : 73.5

    public static void main(String[] args){
        String averageArtur = average("Artur", "Ganiev", 30, 40, 50);
        System.out.println(averageArtur);

        String averageRuslan = average("Ruslan", "Karimov", 30.5, 54.5, 69.1);
        System.out.println(averageRuslan);
    }

    public static  String average(String name, String surname, int... score){
        double average;
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        average = (double) sum/score.length;
        return name + " " + surname + " " + average;
    }

    public static String average(String name, String surname, double... score){
        double average;
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        average = sum/ score.length;
        return name + " " + surname + " " + average;
    }
}
