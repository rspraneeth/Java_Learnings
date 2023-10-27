class Gamma1 extends Thread{
    public void run(){
        System.out.println("Quote started!");
        for (int i=0; i< 5; i++) {
            System.out.println("Focus is the key!!!");
        }
        System.out.println("Quote activity stopped!");
    }
}