package Day_32_nonAccessModifiers.enums._02_complexEnums;

public class Demo {
    public static void main(String[] args) {
        Direction direction = Direction.EAST;
        direction.distance = 2;
        Direction direction2 = Direction.WEST;

        System.out.println(direction);
        System.out.println(direction.shortName);
        System.out.println(direction.distance);
    }
}
