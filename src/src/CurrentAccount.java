public class CurrentAccount extends BankAccount implements WithdrawOption{

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawing: " + amount);
        super.setBalance(super.getBalance()-amount);
        System.out.println("solde: " + super.getBalance());
    }
}

