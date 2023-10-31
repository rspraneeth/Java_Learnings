import java.util.PriorityQueue;

public class LaunchPriorityQ {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
// follows min heap data structure
        System.out.println(pq);
    }
}
