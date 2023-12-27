package rsp.main;

import org.hibernate.Session;
import org.hibernate.Transaction;
import rsp.entity.Account;
import rsp.entity.Employee;
import rsp.util.HibernateUtil;

public class LaunchOnetoOne {

    public static void main(String[] args) {
        Session session = null;
        Transaction transaction = null;
        boolean flag = false;

        try {
            session = HibernateUtil.getSession();
            if (session != null){
                transaction = session.beginTransaction();
                if (transaction != null){
                    Account account = new Account();
                    account.setAccNO("RSP01");
                    account.setName("RSP");
                    account.setType("Saving");
                    Employee employee = new Employee();
                    employee.setName("RSP");
                    employee.setCity("MMD");
                    employee.setSalary(180.3);
                    employee.setAccount(account);
                    session.save(employee);
                    flag = true;
                }

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
