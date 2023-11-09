import java.util.TreeSet;

public class LaunchTreeSet {
    public static void main(String[] args) {
        TreeSet set = new TreeSet(); //set interface, sorted set interface
        set.add(50);
        set.add(100);
        set.add(99);
        set.add(150);
        set.add(1);
        set.add(1);
        System.out.println(set);
        System.out.println(set.ceiling(90));

    }
}
