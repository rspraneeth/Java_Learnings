import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LaunchGenerics {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "RSP";
        names[1] = "Satya";
        names[2] = "Praneeth";
        names[3] = "Reddi";
        System.out.println(Arrays.toString(names));
        for (String i: names) System.out.println(i.toUpperCase());

        ArrayList list = new ArrayList();
        list.addAll(List.of(names));
        list.forEach(o -> {String l = (String) o;
            System.out.println(l.toUpperCase());}); //type safety, so prefer Arrays, when clear about type and size

// usage of generics also reduces this, adding <> to the declaration

        ArrayList<String> list1 = new ArrayList<>();
        list1.addAll(List.of(names));
        list1.forEach(o -> System.out.println(o.toUpperCase()));
    }
}
