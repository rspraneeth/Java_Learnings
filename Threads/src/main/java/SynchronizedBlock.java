public class SynchronizedBlock {
    public static void main(String[] args) {
        Abcd abcd = new Abcd();
        Thread t1 = new Thread(abcd);
        Thread t2 = new Thread(abcd);
        Thread t3 = new Thread(abcd);
        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");
        t1.start();
        t2.start();
        t3.start();
    }
}

class Abcd implements Runnable{
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + "Entered");
            Thread.sleep(3000);
            synchronized (this){
                System.out.println(Thread.currentThread().getName() + "Running");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + "Exited");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}