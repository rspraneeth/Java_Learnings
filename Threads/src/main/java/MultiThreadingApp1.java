import java.util.Scanner;

public class MultiThreadingApp1 {
    public static void main(String[] args) throws InterruptedException {
        Alpha1 a = new Alpha1();
        Beta1 b = new Beta1();
        Gamma1 g = new Gamma1();

        a.start();
        b.start();
        g.start();

        a.join();

        System.out.println("End of main.");

    }
}