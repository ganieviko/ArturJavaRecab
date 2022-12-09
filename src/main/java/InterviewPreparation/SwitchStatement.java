package InterviewPreparation;

public class SwitchStatement {
    public enum Day {
        Sun, Mon, Tue, Wed, Thu, Fri, Sat
    }

    // Main driver method
    public static void main(String[] args) {

        // Enum
        Day[] DayNow = Day.values();

        // Iterating using for each loop
        for (Day now : DayNow) {

            // Switch case
            switch (now) {

                // Case 1
                case Sun:
                    System.out.println("Sunday");

                    // break statement that hault further
                    // execution once case is satisfied
                    break;

                    //Case 2
                case Mon:
                    System.out.println("Monday");
                    break;

                // Case 3
                case Tue:
                    System.out.println("Tuesday");
                    break;

                // Case 4
                case Wed:
                    System.out.println("Wednesday");
                    break;

                // Case 5
                case Thu:
                    System.out.println("Thursday");
                    break;

                // Case 6
                case Fri:
                    System.out.println("Friday");
                    break;

                // Case 7
                case Sat:
                    System.out.println("Saturday");
                    break;
            }
        }
    }
}
