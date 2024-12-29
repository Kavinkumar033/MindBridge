package Day2;
import java.util.*;
class BankAccount
{
    private final int bankNumber;
    private double balance;
    BankAccount(int bankNumber,double balance)
    {
        this.bankNumber=bankNumber;
        this.balance=balance;
    }
    int getBankNumber()
    {
        return this.bankNumber;
    }
    double getBalance()
    {
        return this.balance;
    }

    public void Deposit(double amount)
    {
        System.out.println("************************************");
        System.out.println(this.bankNumber+" Deposited Rs"+amount+"/-");
        this.balance=this.balance+amount;
    }

    public void Withdraw(double amount)
    {
        System.out.println("************************************");
        System.out.println(this.bankNumber+" Withdrawing Rs"+amount+"/-");
        this.balance=this.balance-amount;
    }

    public void DisplayDetails()
    {
        System.out.println("************************************");
        System.out.println("BankNumber : "+this.bankNumber);
        System.out.println("Balance : "+this.balance+"/-");
    }
}
public class OopBank {
    public static void main(String[] args) {
       BankAccount user1 = new BankAccount(123101,50000);
       BankAccount user2 = new BankAccount(123102,60000);
        user1.DisplayDetails();
        user1.Deposit(10000);
        user1.DisplayDetails();
        user1.Withdraw(20000);
        user1.DisplayDetails();
    }
}
