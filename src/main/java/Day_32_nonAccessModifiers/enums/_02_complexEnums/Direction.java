package Day_32_nonAccessModifiers.enums._02_complexEnums;

public enum Direction {
    EAST("E"),
    WEST("W"),
    NORTH("N"),
    SOUTH("S");

    final String shortName;
    int distance;

    Direction(String shortName){
        this.shortName = shortName;
    }
}
