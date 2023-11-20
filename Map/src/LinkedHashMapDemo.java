
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;


public class LinkedHashMapDemo { // child of hash map
    public static void main(String[] args) {
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put(1, "Kohli");
        lhm.put(3, "SKY");
        lhm.put(2, "Rohit");
        lhm.put(null, null);
        lhm.put(3, "Bumrah");
        System.out.println(lhm);

        TreeMap tm = new TreeMap();
        tm.put(4, "Shami");
        tm.put(1, "Kohli");
        tm.put(2, "KL");
//        tm.put(null, null); null pointer exception
        System.out.println(tm);

        Hashtable htb = new Hashtable();
        htb.put(4, "Shami");
        htb.put(1, "Kohli");
        htb.put(2, "KL");
//        htb.put(null, null); null pointer exception
        System.out.println(htb);
    }


}
