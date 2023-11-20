import java.util.HashMap;

class Learner {
    int id;
    String name;

    Learner(int id, String name){
        this.id = id;
        this.name = name;
    }
    Learner(){}
    @Override
    public String toString() {
        return "Learner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}



public class MapDemo {
    //
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(1, "Kohli");
        hm.put(2, "Rohit");
        hm.put(3, "Dhoni");
        System.out.println(hm);

        Learner l = new Learner();
        hm.put(l, "Rahul");
        hm.put("Key", "SKY");
        hm.put(3, "kkkkk");
        hm.put(4, "kkkkk");
        hm.put(null, null);
        System.out.println(hm);
        System.out.println(hm.get(2));
    }
}
