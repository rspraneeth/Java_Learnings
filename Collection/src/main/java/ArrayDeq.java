import java.util.ArrayDeque;

public class ArrayDeq {
    public static void main(String[] args) {
        ArrayDeque ad =new ArrayDeque(); //double ended queue
        ad.add("java");
        ad.addFirst(1);
        ad.addLast("welc");
        System.out.println(ad);
    }
}
