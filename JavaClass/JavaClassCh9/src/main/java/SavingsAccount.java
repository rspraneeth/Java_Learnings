public class SavingsAccount extends BankAccount{
    private final double interestRate;
    public SavingsAccount(double amount, double rate){
        super(amount);
        interestRate = rate;
    }

    public void postInterest(){
        double balance = getBalance();
        double interest = (interestRate/100) * balance;
        setBalance(balance+interest);
        System.out.println("Interest of amount "+interest+" added to balance");
    }
}
