import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee1 implements Comparable<Employee1>{
    int id;
    String name;
    int age;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Employee1(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Employee1 o) {
        if (this.age>o.age) return 1;
        else if (this.age < o.age) return -1;
        return 0;
    }
}

public class LaunchSortingComparable {
    public static void main(String[] args) {
        Employee1 emp1 = new Employee1(1, "RSP", 26);
        System.out.println(emp1);
        Employee1 emp2 = new Employee1(2, "YO", 28);
        System.out.println(emp2);
        Employee1 emp3 = new Employee1(3, "Praneeth", 10);
        System.out.println(emp3);
        List<Employee1> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
