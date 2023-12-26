package com.rsp.main;

import com.rsp.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class LaunchDelete {
    public static void main(String[] args) {
        SessionFactory session = new Configuration().configure().buildSessionFactory();
        Session ses = session.openSession();

        Student st = ses.get(Student.class, 3); //we pass the id here
//        Student st = ses.load(Student.class, 3);
        if (st!=null){
            Transaction transaction = ses.beginTransaction();
            ses.delete(st);
            transaction.commit();
        } else {
            System.out.println("Record not available");
        }
        ses.close();
        session.close();
    }
}
