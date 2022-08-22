public class MethodStack {
    public static void main(String[] args) {
        try {
            methodA();
        }
        catch (ArithmeticException ex){
            System.out.println("Exception caught");
//            ex.printStackTrace();
        }
        finally {
            System.out.println("In finally block");
        }
    }

    static void methodA(){
        System.out.println("in methodA()");
        int a = 2, b = 0;
        System.out.println(a/b);
    }
}
