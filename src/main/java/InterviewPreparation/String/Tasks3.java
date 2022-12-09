package InterviewPreparation.String;

public class Tasks3 {
    public static void main(String[] args) {
        //Create 2 Strings with names
        //Print those names with "Hello" in the beginning
        String name1 = "Artur";
        String name2 = "Emil";
        String taskString = "Hello ";
        System.out.println(taskString.concat(name1));
        System.out.println(taskString.concat(name2));

        String task3 = "I love this class";
        System.out.println(task3.substring(2,6));
        int findIndexOfFirstLetter = task3.indexOf("love");
        int findIndexOfLastLetter = task3.indexOf('t');
        String result = task3.substring(findIndexOfFirstLetter, findIndexOfLastLetter + 1);
        System.out.println(result);

        String longString = "pdfsdlggoultraosjosigsogjiosgis";
        System.out.println(longString.replaceAll("ultra", "mega"));

        boolean startWithP = longString.startsWith("p");
        boolean endWithD = longString.endsWith("d");
        System.out.println(startWithP);
        System.out.println(endWithD);

        String removeAllLetters = longString.replaceAll("s", "");
        boolean checkIfSLetter = removeAllLetters.contains("s");
        System.out.println(removeAllLetters);
        System.out.println(checkIfSLetter);
        if (checkIfSLetter == true){
            System.out.println("String has letter s");
        }else
            System.out.println("String has no s letter");

        //delete the last 5 letters of the given String
        int stringDeletedFiveLastLetters = longString.lastIndexOf('s');
        System.out.println(longString.substring(0, stringDeletedFiveLastLetters - 4));

        // another solution
        String substring = longString.substring(0, longString.length() - 5);
        System.out.println(substring);
        System.out.println(longString.length());
        System.out.println(substring.length());

        String hello = "HelloWorld";
        System.out.println(hello.substring(1, hello.length() -1));

        String word = "Hello";
        String changedWord = word.substring(0, 2);
        word = word.substring(2);
        System.out.println(word.concat(changedWord));
    }
}
