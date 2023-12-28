package rsp.main;

import org.hibernate.Session;
import rsp.entity.Student;
import rsp.util.HibernateUtil;

public class LaunchRetrieve {
    public static void main(String[] args) {
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            if (session != null){
                Student s1 = session.get(Student.class, 1);
                System.out.println(s1);
                System.out.println("-------------------");
                Student s2 = session.get(Student.class, 2);
                System.out.println(s2);
                System.out.println("-------------------");
                Student s3 = session.get(Student.class, 3);
                System.out.println(s3);

            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            HibernateUtil.closeSession(session);
            HibernateUtil.closeSessionFactory();
        }
    }
}
