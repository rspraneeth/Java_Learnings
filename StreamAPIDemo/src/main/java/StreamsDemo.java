import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                System.out.println("in test: Predicate"+i);
                return i % 2 == 0;
            }
        };

        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer num) {
                System.out.println("in apply: Function"+num);
                return num*2; // the same(Function) is passed directly to map()
            }
        };

        BinaryOperator<Integer> bi = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer c, Integer e) {
                System.out.println("in apply: BinaryOperator"+c+" "+e);
                return c+e; //the same(BinaryOperator) is passed directly to reduce()
            }
        };

        List<Integer> nums = Arrays.asList(4, 2, 5, 7, 8, 3, 1, 6);

        Integer sum = nums.stream()
                .filter(predicate)
                .map(function)
                .reduce(0, bi);

        System.out.println(sum);

        System.out.println(nums.stream().filter(i->i%2==0).map(i->i*2).reduce(0, (Integer s, Integer i) ->  s+i));

        System.out.println("*********************************************************");

        System.out.println("Here, filter and map are Intermediate operations(Lazy), reduce is Terminal operation(Eager).");

        System.out.println("""
                Intermediate operations return a new stream. They are always lazy;
                executing an intermediate operation such as filter() does not actually perform
                any filtering, but instead creates a new stream that, when traversed,
                contains the elements of the initial stream that match the given predicate.
                Traversal of the pipeline source does not begin until the terminal operation
                of the pipeline is executed""");
        nums.stream()
                .filter(predicate)
                .map(function);
//                .reduce(0, bi);
//        so if we comment the reduce function, then nothing will get executed because filter and map are
//        intermediate or lazy operation, they execute only when terminal or eager operation gets executed.

    }
}
