import java.util.*;

public class LaunchCollection {
    public static void main(String[] args) { //checking null
        ArrayList al = new ArrayList();
        al.add(33);
        al.add(null);
        System.out.println(al);

        List ll = new LinkedList();
        ll.add(44);
        ll.add(null);
        System.out.println(ll);

        ArrayDeque ad = new ArrayDeque();
        ad.add(22);
//        ad.add(null); null pointer exception
        System.out.println(ad);

        PriorityQueue pq = new PriorityQueue();
        pq.add(11);
//        pq.add(null); null pointer exception
        System.out.println(pq);

        TreeSet ts = new TreeSet();
        ts.add(66);
//        ts.add(null); null pointer exception
        System.out.println(ts);

        HashSet hs = new HashSet();
        hs.add(77);
        hs.add(null);
        hs.add(null);
        hs.add(null);
        System.out.println(hs);

        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(88);
        lhs.add(null);
        System.out.println(lhs);
    }
}
