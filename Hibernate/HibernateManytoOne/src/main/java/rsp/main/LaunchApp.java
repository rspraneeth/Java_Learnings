package rsp.main;

import org.hibernate.Session;
import org.hibernate.Transaction;
import rsp.entity.Branch;
import rsp.entity.Student;
import rsp.util.HibernateUtil;

public class LaunchApp {


    public static void main(String[] args) {
        Session session = null;
        Transaction transaction = null;
        boolean flag = false;

        try {
            session = HibernateUtil.getSession();
            if (session!=null){
                transaction = session.beginTransaction();
                if (transaction != null){
                    Branch branch = new Branch("RSPB1", "teddies", "MMD");
                    Student s1 = new Student("Praneeth", "AMP", branch);
                    Student s2 = new Student("Satya", "VZG", branch);
                    Student s3 = new Student("Sunny", "HYD", branch);
                    session.save(s1);
                    session.save(s2);
                    session.save(s3);
                    flag = true;
                }
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            if (flag) {
                transaction.commit();
                System.out.println("Data Save");
            }
            else {
                transaction.rollback();
                System.out.println("Data not saved");
            }
            HibernateUtil.closeSession(session);
            HibernateUtil.closeSessionFactory();
        }

    }
}
