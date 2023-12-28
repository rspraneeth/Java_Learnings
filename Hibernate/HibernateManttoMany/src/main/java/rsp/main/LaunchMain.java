package rsp.main;

import org.hibernate.Session;
import org.hibernate.Transaction;
import rsp.entity.Course;
import rsp.entity.Student;
import rsp.util.HibernateUtil;

import java.util.HashSet;
import java.util.Set;

public class LaunchMain {
    public static void main(String[] args) {
        Session session = null;
        Transaction transaction = null;
        boolean flag = false;
        try {
            session = HibernateUtil.getSession();
            if (session != null){
                transaction = session.beginTransaction();
                if (transaction != null){
                    Course c1 = new Course("RSP01", "Java", 100);
                    Course c2 = new Course("RSP02", "Spring", 150);
                    Course c3 = new Course("RSP03", "MicroServices", 50);

                    Set<Course> s1 = new HashSet<>();
                    s1.add(c1);
                    s1.add(c2);
                    s1.add(c3);

                    Set<Course> s2 = new HashSet<>();
                    s2.add(c1);
                    s2.add(c2);

                    Set<Course> s3 = new HashSet<>();
                    s3.add(c3);

                    Student st1 = new Student("Praneeth", "MMD", s1);
                    Student st2 = new Student("Satya", "AMP", s2);
                    Student st3 = new Student("RSP", "HYD", s3);

                    session.save(st1);
                    session.save(st2);
                    session.save(st3);

                    flag = true;

                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            if (flag){
                transaction.commit();
                System.out.println("Data Saved.");
            }else {
                transaction.rollback();
                System.out.println("Data not saved.");
            }
            HibernateUtil.closeSession(session);
            HibernateUtil.closeSessionFactory();
        }

    }
}
