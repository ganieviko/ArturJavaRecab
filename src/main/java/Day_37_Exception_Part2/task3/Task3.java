package Day_37_Exception_Part2.task3;

public class Task3 {
    public static Character firstLetter(String input){

        try {
            return input.charAt(0);
        }catch (NullPointerException e){
            System.out.println("The input was null");
            return '0';
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("THe input was empty");
            return '0';
        }
    }

    public static void main(String[] args) {
        System.out.println(firstLetter(null));
        System.out.println(firstLetter(""));
        System.out.println(firstLetter("0"));
        System.out.println(firstLetter("Artur"));
    }
}
