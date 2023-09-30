public class TestAccount {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(500.00, 4.5);
        CheckingAccount c = new CheckingAccount(2500, .5);
        s.deposit(135.22);
        s.postInterest();
        s.withdraw(50);
        System.out.println("Balance of savings account s is "+s.getBalance());
        c.deposit(3000);
        c.processCheck(501);
        c.withdraw(800);
        System.out.println("Balance of checking account c is "+c.getBalance());
    }
}
