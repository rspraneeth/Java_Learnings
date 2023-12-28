package rsp.entity;


import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String city;

    @ManyToOne(cascade = CascadeType.ALL)
    private Branch branch;

    private Student(){
        System.out.println("Student class, zero param constructor for hibernate internal");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", branch=" + branch +
                '}';
    }

    public Student(String name, String city, Branch branch) {
        this.name = name;
        this.city = city;
        this.branch = branch;
    }
}
