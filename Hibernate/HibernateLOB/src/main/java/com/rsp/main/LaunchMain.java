package com.rsp.main;

import com.rsp.entity.Profile;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LaunchMain {
    public static void main(String[] args) throws IOException {
        SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Profile.class).buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        FileInputStream fis = new FileInputStream(new File("C:\\Users\\Praneeth\\Pictures\\Screenshots\\Screenshot1.png"));
        byte[] img = new byte[fis.available()];
        fis.read(img);

        String text = "text file replica as some string";
        char[] ar = text.toCharArray();

        Profile p1 = new Profile("RSP", img, ar);

        session.save(p1);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
