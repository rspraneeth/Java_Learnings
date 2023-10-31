import java.util.LinkedList;

public class LaunchLinkedList {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        ll1.add(10);
        ll1.add(20);
        ll1.addFirst(1);
        ll1.addLast(30);
        ll1.add(2, 15);
        System.out.println(ll1);
    }
}
