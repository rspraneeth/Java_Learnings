public class RunTimeException {
    //throws RunTimeException-ArrayIndexOutOfBoundsException, error is thrown after compiling and executing the program
//    public static void main(String[] args) {
//        int a = Integer.parseInt(args[0]);
//        int b = Integer.parseInt(args[1]);
//        int s = a+b;
//        System.out.println("Sum is"+s);
//    }

    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int s = a+b;
            System.out.println("Sum is "+s);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Index out of bounds exception occurred");
        }
        finally {
            System.out.println("This is finally block");
        }
    }
}
