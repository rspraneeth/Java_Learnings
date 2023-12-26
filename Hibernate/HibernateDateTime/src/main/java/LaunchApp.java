import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;
import java.util.Date;

public class LaunchApp {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .addAnnotatedClass(Implementers.class)
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Implementers implementers = new Implementers();
        implementers.setId(1);
        implementers.setName("RSP");
        implementers.setDate(new Date());
        implementers.setTime(new Date());;
        implementers.setDateTime(new Date());
        session.save(implementers);


        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
