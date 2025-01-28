public class Main {
    public static void main(String[] args) {

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.deposit(1000);
        currentAccount.withdraw(500);
        BankAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(1000);
    }
}