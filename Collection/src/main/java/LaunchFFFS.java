import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchFFFS { // fail fast, fail safe
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
 /*
//        for (int i = 0; i<list.size(); i++) {
//            System.out.println(list.get(i));
//            list.add(44); //modifying while accessing - concurrent modification
//        }

//        Iterator itr = list.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next()+" ");
//            list.add(25); // ConcurrentModificationException , ***"Fail Fast"***
//        }*/

        CopyOnWriteArrayList list1 = new CopyOnWriteArrayList();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        Iterator itr1 = list1.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next()+" ");
            list1.add(25); // Failing ConcurrentModificationException safely , ***"Fail Safe"***
        }

    }
}
