import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
//        Predicate<Integer> predicate = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer i) {
//                return i % 2 == 0;
//            }
//        }; //shortened to below line

//        Predicate<Integer> predicate = i ->  i % 2 == 0; // the same(Predicate) is passed directly to filter()

//        Function<Integer, Integer> function = new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer num) {
//                return num*2; // the same(Function) is passed directly to map()
//            }
//        };

//        Function<Integer, Integer> function = num ->  num*2;

        List<Integer> nums = Arrays.asList(4, 2, 5, 7);
//        System.out.println(nums.stream().filter(i -> i%2==0).map(i -> i*2).reduce(0, (c,e) -> c+e));

        Stream<Integer> s = nums.stream();
//        System.out.println(s.count());

        nums.forEach(i -> System.out.println(i+" "));
        s.forEach(i -> System.out.println(i+" "));
//      s.forEach(i -> System.out.println(i+" ")); // if we try to use again, cant, stream has already been operated upon or closed

        Stream<Integer> s1 = nums.stream();

//        Stream<Integer> s2 = s1.filter(predicate);
        Stream<Integer> s2 = s1.filter(i -> i%2==0);
//        System.out.println("--------------------------");
//        s2.forEach(i -> System.out.println(i+" "));

//        Stream<Integer> s3 = s2.map(function);
        Stream<Integer> s3 = s2.map(i->i*2);
//        System.out.println("--------------------------");
//        s3.forEach(i -> System.out.println(i+" "));

//        Stream<Integer> str1 = nums.stream().filter(i -> i%2==0).map(i -> i*2);
//        System.out.println("--------------------------");
//        str1.forEach(i -> System.out.println(i+" "));

//        nums.stream()
//                .filter(i->i%2==0)
//                .map(i->i*2)
//                .forEach(i -> System.out.println(i+" "));

//        BinaryOperator<Integer> bi = new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer c, Integer e) {
//                return c+e; the same(BinaryOperator) is passed directly to reduce()
//            }
//        }; // reduced to below lambda

//        BinaryOperator<Integer> bi = (Integer c, Integer e) ->  c+e;



//        Integer op = nums.stream().filter(i->i%2==0).map(i->i*2).reduce(0, bi);
        System.out.println("--------------------------");
        System.out.println(nums.stream().filter(i->i%2==0).map(i->i*2).reduce(0, (Integer sum, Integer i) ->  sum+i));


    }
}
