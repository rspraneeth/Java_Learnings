import java.util.Scanner;

class Alpha implements Runnable{

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