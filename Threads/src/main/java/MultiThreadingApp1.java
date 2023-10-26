import java.util.Scanner;

public class MultiThreadingApp1 {
    public static void main(String[] args) {
        Alpha1 a = new Alpha1();
        Beta1 b = new Beta1();
        Gamma1 g = new Gamma1();

        a.start();
        b.start();
        g.start();

    }
}

class Alpha1 extends Thread{
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

class Beta1 extends Thread{
    public void run(){
        System.out.println("Number activity started!");
        for (int i=0; i< 5; i++) {
            System.out.println(i);
        }
        System.out.println("Number activity stopped!");
    }
}

class Gamma1 extends Thread{
    public void run(){
        System.out.println("Quote started!");
        for (int i=0; i< 5; i++) {
            System.out.println("Focus is the key!!!");
        }
        System.out.println("Quote activity stopped!");
    }
}
