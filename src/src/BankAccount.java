public class BankAccount {
    private double balance;
    public void deposit(double amount){
        System.out.println("Depositing: " + amount);
        this.balance += amount;
        System.out.println("Solde : " + balance);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

}

