public class MethodStack1 {
    public static void main(String[] args) {
        try {
            methodA();
            System.out.println("Exiting main without any exceptions");
        }
        catch (ArithmeticException ex){
            System.out.println("Exception caught in main()");
            ex.printStackTrace();
        }
        finally {
            System.out.println("In finally block of main()");
        }
        System.out.println("Done with everything");
    }

    static void methodA(){
        System.out.println("in methodA()");
        try{
            int a = 2, b = 0;
            System.out.println(a/b);
        }
//        catch (ArithmeticException ex){
//            System.out.println("Exception caught in methodA()");
//        }
        finally {
            System.out.println("In the finally block of methodA()");
        }
        System.out.println("exiting methodA()");
    }

}
