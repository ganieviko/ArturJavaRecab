package Day_32_nonAccessModifiers.enums._01_simpleEnum;

public class Demo {
    public static void main(String[] args) {
//        Levels level = Levels.HIGH;
        Levels level = Levels.LOW; // only 3 types of values possible

        WaterLevel boiler1 = new WaterLevel(Levels.SUPERHIGH);

//        if (boiler1.getLevel() == Levels.LOW){
//            System.out.println("The boiler level is low");
//        }


        switch (boiler1.getLevel()){
            case LOW:
                System.out.println("Lever is LOW");
                break;
            case MEDIUM:
                System.out.println("Level is MEDIUM");
                break;
            case HIGH:
                System.out.println("Warning!!!");
                System.out.println("Level is HIGH");
                break;
            default:
                System.out.println("The level is not recognized");
        }
    }
}
