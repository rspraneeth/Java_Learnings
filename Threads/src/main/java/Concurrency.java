import java.util.Scanner;

public class Concurrency {
    public static void main(String[] args) throws InterruptedException {
        Alien al = new Alien();
        Thread t1 = new Thread(al);
        Thread t2 = new Thread(al);
        t1.setName("BANK");
        t2.setName("MSG");
        t1.start();
//        t1.join();
        t2.start();


    }
}

class Alien implements Runnable{
    public void run(){
        String threadName = Thread.currentThread().getName();
        if (threadName.equals("BANK")) banking();
        else message();

    }

    public void banking(){
        Scanner in = new Scanner(System.in);
        System.out.println("Banking app started!!!");
        System.out.println("Enter id: ");
        int i = in.nextInt();
        System.out.println("Enter password: ");
        String p = in.next();
        System.out.println("Login success!!");
        System.out.println("Banking app activity ended");
    }

    public void message(){
        System.out.println("Quote started!");
        for (int i=0; i< 5; i++) {
            System.out.println("Focus is the key!!!");
        }
        System.out.println("Quote activity stopped!");
    }
}
