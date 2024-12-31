//Implement a simple banking system where users can open accounts, deposit money, withdraw money, and check balance using OOP.
package Day2;
class Bank
{
    private int bankNumber;
    private String holderName;
    private double balance;
    Bank(int bankNumber,String holderName,double balance)
    {
        this.bankNumber=bankNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
    void Deposit(double amount)
    {
        if(amount>0)
        {
            System.out.println("----------------------------------");
            this.balance=this.balance+amount;
            System.out.println(this.holderName+" Deposited : "+amount+" /-");
            System.out.println("Current Balance : "+this.balance);
        }
        else
        {
            System.out.println("----------------------------------");
            System.out.println("Invalid deposit amount!!");
        }
    }
    void Withdraw(double amount)
    {
        if(amount>0 && amount<=this.balance)
        {
            System.out.println("----------------------------------");
            this.balance=this.balance-amount;
            System.out.println(this.holderName+" Withdrawn : "+amount+" /-");
            System.out.println("Current Balance : "+this.balance);
        }
        else if(amount>this.balance){
            System.out.println("----------------------------------");
            System.out.println("Withdrawing Insufficient Amount(Rs "+amount+")!!");
        }
        else {
            System.out.println("----------------------------------");
            System.out.println("Invalid withdraw amount!!");
        }
    }
    void DisplayAccountDetails()
    {
        System.out.println("**********************************");
        System.out.println("BankAccount Details");
        System.out.println("BankNumber : "+this.bankNumber);
        System.out.println("HolderName : "+this.holderName);
        System.out.println("Balance : "+this.balance);
    }
    double getBalance()
    {
        return this.balance;
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        Bank holder1 = new Bank(1001,"Kavin",50000.0);
        Bank holder2 = new Bank(1002,"Manoj",60000.0);
        Bank holder3 = new Bank(1003,"Poovarasan",70000.0);
        holder1.DisplayAccountDetails();
        holder1.Deposit(50000);
        holder1.Withdraw(25000);
        holder1.DisplayAccountDetails();

        holder2.DisplayAccountDetails();
        holder2.Deposit(10000);
        holder2.Withdraw(80000);
        holder2.DisplayAccountDetails();

        holder3.DisplayAccountDetails();
        holder3.Deposit(20000);
        holder3.Withdraw(90000);
        holder3.DisplayAccountDetails();
    }
}
