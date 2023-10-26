public class App1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started!!!");
        Thread thread = Thread.currentThread();
        System.out.println("Current running thread: "+Thread.currentThread().getName());
        System.out.println("Current thread priority is: "+Thread.currentThread().getPriority());
        System.out.println("------------------------------------------------");
        thread.setName("RSP");
        thread.setPriority(6);
        System.out.println("After changing...");
        System.out.println("Current running thread: "+Thread.currentThread().getName());
        System.out.println("Current thread priority is: "+Thread.currentThread().getPriority());


//        Thread.sleep(5000);
        System.out.println("Main thread finished!!!");
    }
}
