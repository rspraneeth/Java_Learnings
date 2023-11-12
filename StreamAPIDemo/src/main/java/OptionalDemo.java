import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("rsp", "praneeth", "satya", "reddi", "praneethrsp", "rspraneeth");
        String name = null;
        for (String n: names){
            if (n.contains("a")){
                name = n;
                break;
            }
        }
        assert name != null; //making sure name is not null condition
        System.out.println("String length "+name+" with letter a is "+name.length());


        Optional<String> name1 = names.stream()
                .filter(n -> n.contains("z"))
                .findFirst();

        System.out.println(name1.orElse("Not found"));

//        to get rid of null pointer exception, optional class is introduced.
    }
}
