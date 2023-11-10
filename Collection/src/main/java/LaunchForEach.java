import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LaunchForEach {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(10);
        list.add(40);
        System.out.println(list);

        List<Integer> list1 = Arrays.asList(20, 30, 50, 10, 40);
        System.out.println(list1);

//        for (Integer i: list1) System.out.print(i + " ");

        list1.forEach(n -> System.out.print(n + " "));

    }
}
