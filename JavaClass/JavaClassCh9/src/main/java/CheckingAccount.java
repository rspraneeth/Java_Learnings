public class CheckingAccount extends BankAccount{
    private final double minBalance;
    private final double charge;

    public CheckingAccount(double minAmount, double charge){
        super();
        minBalance = minAmount;
        this.charge = charge;
    }


    public void processCheck(double amount){
        if (getBalance() >= minBalance){
            super.withdraw(amount);
            System.out.println("Check processed");
        }
        else {
            System.out.println("Balance is less than min balance, you are charged an amount of "+charge);
            super.withdraw(amount+charge);
        }
    }

    public void withdraw(double amount){
        processCheck(amount);
    }
}
