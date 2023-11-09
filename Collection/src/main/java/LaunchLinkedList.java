import java.util.LinkedList;
import java.util.List;

public class LaunchLinkedList {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList(); //follows deque and list
        ll1.add(10);
        ll1.add(20);
        ll1.addFirst(1);
        ll1.addLast(30);
        ll1.add(2, 15);
        System.out.println(ll1);

        LinkedList list = new LinkedList();
        list.add(10);
        list.add('g');
        list.add("Java");
        list.add(33.22);

        System.out.println(list);
        System.out.println(list.contains("Java"));
        System.out.println(list.getFirst());
        System.out.println(list.peekFirst());
        System.out.println(list);
        System.out.println(list.pollFirst()); //remove from collection
        System.out.println(list);
        list.offer(111); // adds
        System.out.println(list);

        list.push(200);
        System.out.println(list);
        list.pop();
        System.out.println(list);

    }
}
