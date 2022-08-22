class InvalidBalanceException extends Exception{
    public InvalidBalanceException(String message){
        super(message);
    }
}
public class userDefined {
    public static void main(String[] args) {
        int balance;
        try {
            balance = Integer.parseInt(args[0]);
            checkBal(balance);
            System.out.println("Executed without any exceptions");
        } catch (InvalidBalanceException e) {
            System.out.println("Invalid balance exception caught");
        } catch (NumberFormatException ex){
            System.out.println("Number format exception caught");
        } catch (IndexOutOfBoundsException ex){
            System.out.println("Index out of bounds exception caught");
        } catch (Exception ex){
            System.out.println("Some new exception caught");
        } finally {
            System.out.println("Finally block executed");
        }
    }

    public static void checkBal(int bal) throws InvalidBalanceException{
        if (bal < 0)
            throw new InvalidBalanceException("Balance should be greater than zero");
        System.out.println("Balance updated through checkBal() method "+bal);
    }
}
