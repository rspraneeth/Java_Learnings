package com.rsp.main;

import com.rsp.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Launch1 {
    public static void main(String[] args) {
        //inform JVM to activate Hibernate
        Configuration config = new Configuration();
        config.configure();

        //all objects required for hibernate are present in session factory
        //creating session factory to hold all other required objects for hibernate
        SessionFactory sessionFactory = config.buildSessionFactory();

        //time to do task using specific objects, persistence operation
        Session session = sessionFactory.openSession();

        //only for non-select operation transaction must be here
        Transaction transaction = session.beginTransaction();

        //create persistence object
        Student student = new Student(2, "RSP", "USA");

        //perform persistence operation
        //session.save(student);
        //session.update(student);
        session.saveOrUpdate(student);
        //commit the operation
        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
