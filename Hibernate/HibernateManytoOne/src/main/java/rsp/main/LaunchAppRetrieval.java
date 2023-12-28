package rsp.main;

import org.hibernate.Session;
import rsp.entity.Student;
import rsp.util.HibernateUtil;

public class LaunchAppRetrieval {
    public static void main(String[] args) {
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            Student student = session.get(Student.class, 1);
            System.out.println(student);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            HibernateUtil.closeSession(session);
            HibernateUtil.closeSessionFactory();
        }

    }
}
