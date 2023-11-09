import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashS {
    public static void main(String[] args) {
        HashSet hs = new HashSet();

        hs.add("java");
        hs.add(20);
        hs.add(30);
        hs.add(4);
        hs.add(44);
        System.out.println(hs);
        System.out.println(hs.contains(20));

        LinkedHashSet hs1 = new LinkedHashSet();
        hs1.add("java");
        hs1.add(20);
        hs1.add(20);
        hs1.add(30);
        hs1.add(55);
        hs1.add("kkk");
        System.out.println(hs1);
    }
}
