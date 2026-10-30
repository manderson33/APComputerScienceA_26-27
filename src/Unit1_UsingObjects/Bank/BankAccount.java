package Unit1_UsingObjects.Bank;

/**
 * @author marilounanderson on 14/10/2026
 */
public class BankAccount {
    //instance variables
    //private means not allowing other class to access the variables
    private String name;
    private double balance;

    //constructor
    public BankAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    //getAccountName = returns the name of the account holder
    public String getAccountName(){
        return name;
    }

    //getBalance = return the current balance of the bank account
    public double getBalance(){
        return balance;
    }

    //deposit = adds a specified amount to the current balance
    public void deposit(double amount){
        balance = balance + amount;
    }

    //withdraw = subtracts a specified amount from the balance
    //only if funds are sufficient. If the withdrawal amount is greater
    //than the  current balance, no action is taken
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }else{
            System.out.println("Insufficient funds!");
        }
    }

    //printAccountInfo - prints the account holder's name and current balance in
    //two separate lines
    public void printAccountInfo(){
        System.out.println("Account Name: " + name);
        System.out.println("Account Balance: " + balance);
    }
}


class TestBA{
    static void main(){
        //create 2 BankAccount objects savings1 Alex, 1000  and savings2 John, 5000
        BankAccount savings1 = new BankAccount("Alex", 1000);
        BankAccount savings2 = new BankAccount("John", 5000);

        //you cannot print a void method
        savings1.deposit(10000);
        savings2.deposit(10000);

        savings1.printAccountInfo();
        savings2.printAccountInfo();

        //savings1 - 12000
        //savings2 - 5000
        //print the account info again
        savings1.withdraw(12000);
        savings2.withdraw(5000);

        System.out.println("After withdrawing...");
        savings1.printAccountInfo();
        savings2.printAccountInfo();


    }
}
