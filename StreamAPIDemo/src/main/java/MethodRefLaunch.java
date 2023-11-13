import java.util.Arrays;
import java.util.List;


class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class MethodRefLaunch {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("rsp", 24),
                new Student("praneeth", 26),
                new Student("satya", 25));

        students.stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
