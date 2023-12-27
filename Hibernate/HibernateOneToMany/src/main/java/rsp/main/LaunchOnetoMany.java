package rsp.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import rsp.entity.Department;
import rsp.entity.Employee;
import rsp.util.HibernateUtil;

import java.util.HashSet;
import java.util.Set;

public class LaunchOnetoMany {

    public static void main(String[] args) {
        Session session = null;
        Transaction transaction = null;
        boolean flag = false;

        try {
            session = HibernateUtil.getSession();
            if (session != null){
                transaction = session.beginTransaction();
                if (transaction != null){
                    Employee e1 = new Employee("RSP", "MMD", 187.3);
                    Employee e2 = new Employee("Praneeth", "HYD", 220.2);
                    Employee e3 = new Employee("Satya", "AMP", 245.6);
                    Set<Employee> set = new HashSet<>();
                    set.add(e1);
                    set.add(e2);
                    set.add(e3);
                    Department department = new Department();
                    department.setDepId("RSP01");
                    department.setName("Implementers");
                    department.setEmployee(set);
                    session.save(department);
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
