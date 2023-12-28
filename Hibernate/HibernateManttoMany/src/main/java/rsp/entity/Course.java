package rsp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    private String cid;
    private String cname;
    private Integer cost;

    public Course(){
        System.out.println("Course class, zero parameterized constructor for hibernate internal.");
    }

    @Override
    public String toString() {
        return "Course{" +
                "cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                ", cost=" + cost +
                '}';
    }

    public Course(String cid, String cname, Integer cost) {
        this.cid = cid;
        this.cname = cname;
        this.cost = cost;
    }
}
