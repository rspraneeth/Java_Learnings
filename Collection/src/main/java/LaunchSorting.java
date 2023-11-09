import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
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

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

class Alpha implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.age>o2.age) return 1;
        else if (o1.age < o2.age) return -1;
        return 0;
    }

}
public class LaunchSorting {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "RSP", 26);
        System.out.println(emp1);
        Employee emp2 = new Employee(2, "YO", 28);
        System.out.println(emp2);
        Employee emp3 = new Employee(3, "Praneeth", 10);
        System.out.println(emp3);
        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println(list);

        //Collections.sort(list); //wont sort, have to sort by either implementing comparator or comparable interface
        Alpha alpha = new Alpha();
        Collections.sort(list, alpha);
        System.out.println(list);

        Comparator<Employee> sorting = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.id>o2.id) return 1;
                return -1;
            }
        };

        Collections.sort(list, sorting);
        System.out.println(list);

        Comparator<Employee> sorting1 = (Employee o1, Employee o2) -> {
            if (o1.age>o2.age) return 1;
            return -1;
        };

        Collections.sort(list, sorting1);
        System.out.println(list);

        Collections.sort(list, (Employee o1, Employee o2) -> {
            if (o1.id>o2.id) return 1;
            return -1;
        });
        System.out.println(list);
    }
}
