class MSword implements Runnable{
    public void typing(){
        for (int i = 0; i <= 4; i++){
            System.out.println("typing...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void spellCheck(){
        for (;;){
            System.out.println("checking...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void autoSave(){
        for (;;){
            System.out.println("saving...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        if (tname.equals("TYPE")){
            typing();
        } else if (tname.equals("SPELLCHECK")) {
            spellCheck();
        }
        else {
            autoSave();
        }
    }
}

public class DaemonThread {
    public static void main(String[] args) {
        MSword ms = new MSword();
        Thread t1 = new Thread(ms);
        Thread t2 = new Thread(ms);
        Thread t3 = new Thread(ms);

        t1.setName("TYPE");
        t2.setName("SPELLCHECK");
        t3.setName("AUTO-SAVE");

        t2.setDaemon(true);
        t3.setDaemon(true);

//        t1.setPriority(6);
        t2.setPriority(3);
        t3.setPriority(2);

        t1.start();
        t2.start();
        t3.start();


    }
}
