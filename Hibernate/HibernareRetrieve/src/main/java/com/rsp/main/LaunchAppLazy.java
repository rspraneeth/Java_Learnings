package com.rsp.main;

import com.rsp.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LaunchAppLazy {
    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        System.out.println("Name of class implementing session factory: "+sessionFactory.getClass().getName());
        Student st = session.load(Student.class, 3);
        System.out.println(st.toString());

        session.close();
        sessionFactory.close();
    }
}
