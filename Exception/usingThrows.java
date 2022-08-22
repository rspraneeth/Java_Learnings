import java.util.Scanner;

public class usingThrows {
    public static void main(String[] args) {
        try {
            methodA();
            System.out.println("Done with methodA() in try block");
        }
        catch (ArithmeticException ex){
            System.out.println("Exception caught");
        }
        finally {
            System.out.println("Finally executed");
        }
        System.out.println("main method completed");

    }
    static void methodA() throws ArithmeticException{
        int a = 2, b;
        Scanner in = new Scanner(System.in);
        b = in.nextInt();
        if (b == 0)
            throw new ArithmeticException();
        else
            System.out.println("its"+(a/b));
        System.out.println("Exiting methodA()");
    }
}

