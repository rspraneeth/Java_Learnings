package rsp.main;

import org.hibernate.Session;
import org.hibernate.Transaction;
import rsp.entity.Account;
import rsp.entity.Employee;
import rsp.util.HibernateUtil;

public class LaunchRetrieve {
    public static void main(String[] args) {
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            if (session != null){
                Employee e = session.get(Employee.class, 1);
                System.out.println(e);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            HibernateUtil.closeSession(session);
            HibernateUtil.closeSessionFactory();
        }
    }
}
