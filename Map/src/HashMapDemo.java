
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Kohli");
        hm.put(3, "Rohit");
        hm.put(2, "KL");
        System.out.println(hm);
        hm.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
        Collection values = hm.values();
        Iterator i = values.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        Set<Integer> keys = hm.keySet();
        Iterator k = keys.iterator();
        while (k.hasNext()){
            Integer key = (Integer) k.next();
            System.out.print(key+" ");
            System.out.println(hm.get(key));
        }

        Set entries = hm.entrySet();
        Iterator i1 = entries.iterator();
        while (i1.hasNext()){
            Map.Entry pair = (Map.Entry) i1.next();
            System.out.println(pair+", "+pair.getKey()+" "+pair.getValue());
        }

    }
}
