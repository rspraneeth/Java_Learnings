import java.util.PriorityQueue;

public class LaunchPriorityQ {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(); //follows min heap data structure
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(75);


        System.out.println(pq);
    }
}
