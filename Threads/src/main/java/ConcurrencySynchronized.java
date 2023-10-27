public class ConcurrencySynchronized {
    public static void main(String[] args) {
        Abc abc = new Abc();
        Thread t1 = new Thread(abc);
        Thread t2 = new Thread(abc);
        Thread t3 = new Thread(abc);
        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");
        t1.start();
        t2.start();
        t3.start();
    }
}

class Abc implements Runnable{
    synchronized public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + "Entered");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + "Exited");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}