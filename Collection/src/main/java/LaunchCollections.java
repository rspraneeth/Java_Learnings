import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaunchCollections {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(20);
        list.add(10);
        list.add(40);
        list.add(30);
        list.add(50);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collections.rotate(list, 1);
        System.out.println(list);

        Collections.rotate(list, -1);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        System.out.println(Collections.frequency(list, 30));
        list.add(30);
        System.out.println(Collections.frequency(list, 30));
        list.remove(5);
        System.out.println(list);
    }
}
