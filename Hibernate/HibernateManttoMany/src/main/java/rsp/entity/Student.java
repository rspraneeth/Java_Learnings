package rsp.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String city;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Course> courses;

    public Student(){
        System.out.println("Student class, zero parameterized constructor for hibernate internal use");
    }

    public Student(String name, String city, Set<Course> courses) {
        this.name = name;
        this.city = city;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", courses=" + courses +
                '}';
    }
}
