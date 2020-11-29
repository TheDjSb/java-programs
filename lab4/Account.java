package lab4;

public class Account {

    private double balance;
    private int acctNum;

    public Account (int num)
    {
        balance = 0.0;
        acctNum = num;
    }
    public void deposit (double amt)
    {
        if (amt >0)
            balance +=amt;
        else
            System.out.println("Account.deposit(...): "
                    +"cannot deposit negative amount.");
    }
    public void withdraw (double amt)
    {
        if (amt>0)
            balance -=amt;
        else
            System.err.println("Account.withdraw(...): "
                    +"cannot withdraw negative amount.");

    }
    public double getBalance()
    {
        return balance;
    }
    public double getAccountNumber()
    {
        return acctNum;
    }
    public String toString()
    {
        return "Acc " + acctNum + ": " + "balance = "+ balance;
    }
    public final void print()
    {
        System.out.println( toString());
    }
}
 class SavingsAccount extends Account {
    private double interest;

    public SavingsAccount(int acctNum, double interest) {
        super(acctNum);
        this.interest=interest;
    }
    public double getInterest() {
        double x= getBalance() + getBalance()*interest;
        return x;
    }
    public void AddInterest (double interest) {
        double x = super.getBalance() * interest;
        super.deposit(x);
    }
    public String toString() {
        return super.toString()+" Interest : " + interest;
    }
}
class CheckingAccount extends Account {
    private double limit;
    public CheckingAccount(int acctNum, double limit) {
        super(acctNum);
        this.limit=limit;
    }
    public double getLimit() {
        return this.limit;
    }
    public void setLimit(double limit) {
        this.limit=limit;
    }
    public void withdraw (double limit) {
        if (limit <= this.limit)
            super.withdraw(limit);
        else {
            System.out.println(" Sorry, Limit Exceeded" );
        }
    }
    public String toString() {
        return super.toString() +"Limit :   "+limit;
    }
}
class Bank {

    public static void main(String[] args) {
        Account[] accounts = new Account[2];
        accounts[0] = new SavingsAccount(2, 0.25);
        accounts[1] = new CheckingAccount(23, 500);
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] instanceof SavingsAccount) {
                // You must cast an Account to use any of the descendant's methods
                SavingsAccount account = (SavingsAccount) accounts[i];
                account.deposit(2000);
                System.out.println("Account Number: " + account.getAccountNumber());
                System.out.println("Saving Balance: " + account.getBalance());
                System.out.println("Interest: " + account.getInterest());
                System.out.println("....................................");
            } else  {
                CheckingAccount account = (CheckingAccount) accounts[i];
                System.out.println("Account Number: " + account.getAccountNumber());
                account.deposit(2000);
                System.out.println("Checking Balance: " + account.getBalance());
                account.withdraw(500);
                System.out.println("Checking Balance after withdrawn: " + account.getBalance());
            }
        }
    }
}