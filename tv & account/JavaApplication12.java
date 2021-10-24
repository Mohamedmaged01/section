
package javaapplication12;


public class JavaApplication12 {

  
    public static void main(String[] args) {
     Account account = new Account(1857, 5000, 0.12);

        account.setID(1857);
        account.setBalance(5000);
        account.setAnnualInterestRate(0.12);



        System.out.println ("Account number: \n"+ +account.getID());
        System.out.println ("The account balance is: $ \n" + +account.getbalance());
        System.out.println("The Annual Interest Rate is: $ \n" + account.getannualInteresrRate());
        account.deposit(150);
        System.out.println("The account balance is: $ \n" +account.getbalance());
        account.withdraw(50);
        System.out.println("The account balance is: $ \n" +account.getbalance());
        System.out.println ("The monthly interest earned is: $ \n" + +account.getbalance() *    account.annualInterestRate());
        System.out.println ("The account was created on: \n" + +account.getdateCreated());

    }
    
}
