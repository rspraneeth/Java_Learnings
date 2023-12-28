package com.rsp.main;

import com.rsp.entity.Profile;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class LaunchRetrieval {
    public static void main(String[] args) throws IOException {
        SessionFactory sessionFactory = new Configuration().configure().
                addAnnotatedClass(Profile.class).buildSessionFactory();

        Session session = sessionFactory.openSession();

        Profile p = session.get(Profile.class, 1);
        System.out.println(p.getPid()+" "+p.getName());

        byte[] img =p.getImg();
        FileOutputStream fos=new FileOutputStream("Java.jpg");
        fos.write(img);

        fos.flush();

        char[] text =p.getCharfile();
        FileWriter fw=new FileWriter("Java.txt");
        fw.write(text);

        fw.flush();

        fos.close();
        fw.close();
        session.close();
    }
}
