import java.util.Scanner;

public class MultiThreadingApp {
    public static void main(String[] args) {
        Alpha a = new Alpha();
        Beta b = new Beta();
        Gamma g = new Gamma();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(g);

        t1.start();
        t2.start();
        t3.start();

    }
}

class Alpha implements Runnable{

    public void run(){
        Scanner in = new Scanner(System.in);
        System.out.println("Banking app started!!!");
        System.out.println("Enter id: ");
        int i = in.nextInt();
        System.out.println("Enter password: ");
        String p = in.next();
        System.out.println("Login success!!");
        System.out.println("Banking app activity ended");

    }
}

class Beta implements Runnable{
    public void run(){
        System.out.println("Number activity started!");
        for (int i=0; i< 5; i++) {
            System.out.println(i);
        }
        System.out.println("Number activity stopped!");
    }
}

class Gamma implements Runnable{
    public void run(){
        System.out.println("Quote started!");
        for (int i=0; i< 5; i++) {
            System.out.println("Focus is the key!!!");
        }
        System.out.println("Quote activity stopped!");
    }
}
