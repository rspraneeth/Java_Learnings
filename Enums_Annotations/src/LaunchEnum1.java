import java.util.Arrays;

enum Week{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class LaunchEnum1 {
    enum Direction{ // we can define enum inside a class as well.
        NORTH, SOUTH, EAST, WEST;
    }
    public static void main(String[] args) {
        Week w = Week.MONDAY;
        System.out.println(w);
        System.out.println(Week.valueOf("MONDAY")); // returns the enum constant of the Week with the specified name (MONDAY)
        System.out.println(Week.valueOf("TUESDAY").ordinal()); // returns the ordinal/index of the enum constant (1)
        System.out.println(Arrays.stream(Week.values()).map(Enum::name).toList()); // returns an array of all enum constants of the Week class.
        Week[] week = Week.values();
        for (Week el: week) {
            System.out.print(el.ordinal()+": "+el+" ");
        }
    }
}
