import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        List list2 = new ArrayList();
        list2.add(10);
        list2.add('J');
        list2.add("Java");
        System.out.println(list2);

        List list3 = new ArrayList();
        list3.addAll(list2);
        list3.addAll(list);
        System.out.println(list3);
    }
}
