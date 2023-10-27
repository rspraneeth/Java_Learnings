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