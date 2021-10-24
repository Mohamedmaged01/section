import java.util.Scanner;
import java.util.Date;

public class Account
{
    private int id = 0;
    private double balance = 0;
    final private double annualinterestrate = 0.12;
    Date dateCreated;

    public Account()
    {

    }

    public Account(int aId, double aBalance, double annualInterestRate)
    {
        id = aId;
        balance = aBalance;
        annualInterestRate = annualInterestRate;
        dateCreated = new Date();
    }

    public void setID (int aId)
    {
        id = aId;
    }

    public int getID()
    {
        return id;
    }

    public void setBalance (double aBalance)
    {
        balance = aBalance;
    }

    public double getbalance()
    {
        return balance;
    }

    public void setAnnualInterestRate (double annualInterestRate)
    {
       annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    public Date getDateCreated()
    {
        return dateCreated;
    }

    public double getMonthlyInterestRate()
    {
        return annualInterestRate / 12;
    }

    public void withdraw(double amount)
    {
        balance -= amount;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }
}