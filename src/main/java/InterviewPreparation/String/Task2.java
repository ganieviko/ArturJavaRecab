package InterviewPreparation.String;

public class Task2 {
    public static void main(String[] args) {
        String testingString = "     Techno Study";
        //testingString = testingString.trim();
        System.out.println(testingString);
        System.out.println(testingString.trim());

        //replace only the char to the desire char
        System.out.println(testingString.replace('T','A'));
        System.out.println(testingString.replace("Techno","Artur"));

        String myString = "Artur working as Uber driver, but hopefully soon he will change his job";
        myString = myString.replaceAll("a", "O");
        System.out.println(myString);
    }
}
