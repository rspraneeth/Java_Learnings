import java.util.ArrayList;

public class WrapperDemo {
    public static void main(String[] args) {
//        java is not 100% object oriented because of primitive types.
        int a = 10;
//        Integer x = new Integer(10);
        Integer i = Integer.valueOf(10);
        Integer b = a; // auto boxing
        int c = b; // auto unboxing
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.TYPE);

        Double d = Double.valueOf(10.2);
        double d1 = d.doubleValue(); // unboxing
        double dou = d; // auto unboxing


        ArrayList<Object> list = new ArrayList<>();
        list.add(10); // internally auto boxing takes place and saves the primitive type into Object type


    }
}
