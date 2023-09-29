import java.util.Scanner;

public class CreditEnquiry {
    private static final MenuOption[] choices = MenuOption.values();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    }

    private static MenuOption getRequest(Scanner input){
        int request = 4;
        System.out.printf("%nEnter request%n%s%n%s%n%s%n%s%n",
                "1 - List accounts with zero balances",
                "2 - List accounts with credit balances",
                "3 - List accounts with debit balances",
                "4 - Terminate program");

        return null;
    }
}
