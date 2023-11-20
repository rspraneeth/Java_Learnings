import java.util.*;

class IDCard{
    private Integer age;
    private String name;
    private String city;

    public IDCard(Integer age, String name, String city) {
        this.age = age;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "IDCard{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
public class MapLaunch {
    public static void main(String[] args) {
        IDCard i1 = new IDCard(13, "RSP", "OP");
        IDCard i2 = new IDCard(14, "Satya", "MMD");
        IDCard i3 = new IDCard(26, "Praneeth", "AP");
        IDCard i4 = new IDCard(23, "Reddi", "CALI");
        HashMap<Integer, IDCard> map = new HashMap<>();
        map.put(1, i1);
        map.put(2, i2);
        map.put(3, i3);
        map.put(4, i4);

        System.out.println("Welcome to information center");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the id card number: ");
        Integer id = in.nextInt();

        Set entry = map.entrySet();
        Iterator i = entry.iterator();
        boolean flag = false;
        while (i.hasNext()){
            Map.Entry pair = (Map.Entry) i.next();
            Integer key = (Integer) pair.getKey();
            if (key == id) {
                flag = true;
                System.out.println("Details: "+pair.getValue());
            }
        }

        if (!flag) System.out.println("Invalid id card number.");

    }
}
