import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class LaunchAccessing {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(33);
        list.add(null);
        list.add(44);
        list.add(55);
        System.out.println(list);
        System.out.println(list.indexOf(null));

        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" ");
            if (i == 2) list.add(66);
        }
        System.out.println();
        for (Object o: list) {
            System.out.print(o+" ");
        }
        System.out.println();
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        ListIterator litr = list.listIterator();
        while (litr.hasNext()){
            System.out.print(litr.next()+" ");
        }
        System.out.println();
        ListIterator litr1 = list.listIterator(1);
        while (litr1.hasNext()){
            System.out.print(litr1.next()+" ");
        }
        System.out.println();
        ListIterator litr2 = list.listIterator(list.size());
        while (litr1.hasPrevious()){
            System.out.print(litr1.previous()+" ");
        }
        System.out.println();
        ArrayDeque ad = new ArrayDeque();
        ad.add(10);
        ad.add(20);
        ad.add(30);
        Iterator it = ad.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+ " ");
        }


    }
}
