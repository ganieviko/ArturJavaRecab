package Day_37_Exception_Part2.multiCatch;

public class MultiCatch {
    public static void main(String[] args) {
        String input = "123";
        int a = 1;
        int b = 0;

        try{
            input.charAt(1);
            int i = a / b;
        }catch (NullPointerException e){
            System.out.println("THe input is null");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("The input index not found");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Run time exception");
        } catch (Exception e){
            System.out.println("Handle general exception");
            System.out.println(e.getMessage());
        }
    }
}
