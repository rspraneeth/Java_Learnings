public abstract class BankAccount {
    private double balance;

    public BankAccount(){
        balance = 0;
    }

    public BankAccount(double initialAmount){
        balance = initialAmount;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println("Withdrawal successful");
        }
        else System.out.println("Insufficient funds");
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double amount){
        balance = amount;
    }
}
