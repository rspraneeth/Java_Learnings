package rsp.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import rsp.entity.Student2;
import rsp.util.HibernateUtil;

public class LaunchApp {
    public static void main(String[] args) {
        Session session = null;
        Transaction transaction = null;
        boolean flag = false;

        try {
            session = HibernateUtil.getSession();
            if (session != null)
                transaction = session.beginTransaction();
            if (transaction != null){
                Student2 st = new Student2();
                st.setId(1);
                st.setName("RSP");
                st.setPlace("MMD");
                session.save(st);
                flag = true;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {

            if (flag) {
                transaction.commit();
                System.out.println("Data Saved");
            }
            else{
                transaction.rollback();
                System.out.println("Not saved");
            }

            HibernateUtil.closeSession(session);
            HibernateUtil.closeSessionFactory();
        }


    }
}
