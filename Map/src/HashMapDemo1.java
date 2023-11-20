import java.util.HashMap;

class Learner1 {
    int id;
    String name;

    Learner1(int id, String name){
        this.id = id;
        this.name = name;
    }
    Learner1(){}
    @Override
    public String toString() {
        return "Learner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
public class HashMapDemo1 {
    public static void main(String[] args) {
        Learner1 learner1 = new Learner1(15, "RSP");
        HashMap map = new HashMap();
        map.put(learner1, "Java");
        System.out.println(map);

    }
}
