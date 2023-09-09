import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {
    public static int quotient(int numerator, int denominator) throws ArithmeticException{
        return numerator/denominator;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean continueLoop = true;
        do {
            try{
                System.out.println("Enter numerator: ");
                int numerator = in.nextInt();
                System.out.println("Enter denominator: ");
                int denominator = in.nextInt();
                int result = quotient(numerator, denominator);
                System.out.println("Result of "+numerator+"/"+denominator+" is "+result);
                continueLoop = false;
            }catch (InputMismatchException e){
                System.err.println("Exception: "+e);
                in.nextLine();
                System.out.println("You must enter integers");
            }
            catch (ArithmeticException e){
                System.err.println("Exception: "+e);
                in.nextLine();
                System.out.println("Zero is an invalid denominator, try again.");
            }
        }while (continueLoop);
    }
}
