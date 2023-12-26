import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LaunchRet {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Implementers.class).buildSessionFactory();
        Session session = sessionFactory.openSession();
        Implementers imp = session.get(Implementers.class, 2);

        if (imp!=null)
            System.out.println(imp);
        else
            System.out.println("Data not present");


    }
}
