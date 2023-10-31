class Library implements Runnable{

    String res1 = new String("Java");
    String res2 = new String("SpringBoot");
    String res3 = new String("DSA");
    @Override
    public void run() {
        String tName = Thread.currentThread().getName();
        if ("Student1".equals(tName)){
            try {
                Thread.sleep(5000);
                synchronized (res1){
                    System.out.println("Student 1 has acquired res1: "+res1);
                    Thread.sleep(5000);
                    synchronized (res2){
                        System.out.println("Student 1 has acquired res2: "+res2);
                        Thread.sleep(5000);
                        synchronized (res3){
                            System.out.println("Student 1 has acquired res3: "+res3);
                            Thread.sleep(5000);
                        }
                    }
                }
            }catch (Exception e){
                System.out.println("Some problem");
            }
        }
        else {
            try {
                Thread.sleep(5000);
                synchronized (res1) {
                    System.out.println("Student 2 has acquired res3: " + res1);
                    Thread.sleep(5000);
                    synchronized (res2) {
                        System.out.println("Student 2 has acquired res2: " + res2);
                        Thread.sleep(5000);
                        synchronized (res3) {
                            System.out.println("Student 2 has acquired res3: " + res3);
                            Thread.sleep(5000);
                        }
                    }
                }
            }catch (Exception e){
                System.out.println("Some problem");
            }
        }
    }
}

public class Locks {
    public static void main(String[] args) {
        Library library = new Library();
        Thread t1 = new Thread(library);
        Thread t2 = new Thread(library);
        t1.setName("Student1");
        t2.setName("Student2");

        t1.start();
        t2.start();


    }
}
