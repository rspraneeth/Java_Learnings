class Beta implements Runnable{
    public void run(){
        System.out.println("Number activity started!");
        for (int i=0; i< 5; i++) {
            System.out.println(i);
        }
        System.out.println("Number activity stopped!");
    }
}
