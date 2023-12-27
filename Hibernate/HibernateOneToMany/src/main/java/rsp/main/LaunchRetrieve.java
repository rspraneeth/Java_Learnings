package rsp.main;

import org.hibernate.Session;

import rsp.entity.Department;
import rsp.util.HibernateUtil;

public class LaunchRetrieve {
    public static void main(String[] args) {
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            if (session != null){
                Department dept = session.get(Department.class, "RSP01");
                System.out.println(dept);

            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            HibernateUtil.closeSession(session);
            HibernateUtil.closeSessionFactory();
        }
    }
}
