import java.util.Arrays;
import java.util.List;

public class MethodRefDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("rsp", "praneeth", "satya", "reddi", "praneethrsp", "rspraneeth");
        names.stream()
                .map(n -> n.toUpperCase())
                .forEach(n -> System.out.println(n));

        System.out.println("------------------------------------");

//        the same can be written using method reference as below, functional style

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("------------------------------------");

        List<String> unames = names.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(unames);
    }
}
