package Unit1_UsingObjects;

import java.util.Scanner;

/**
 * @author marilounanderson on 07/09/2026
 */
public class BankAccount {

    /**
     * Deposits money to the account, updates the balance
     * and returns the updated balance
     * Precondition: amount >= 0
     * @param balance, the current balance
     * @param amount, the amount of money to deposit
     */
    public static double deposit(double balance, double amount){
        balance += amount;      // balance = balance + amount
        return balance;
    }

    public static double withdraw(double balance, double amount){
        balance = balance - amount;
        return balance;
    }

    //write method to add an interest of 3% to the account balance
    public static double interest(double balance){
        final double interest = 1.03;
        balance *= interest;
        return balance;
    }

    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = input.nextLine(); //enter multiple words

        double balance = 500;

        System.out.print("Enter amount to deposit: ");
        double amountD = input.nextDouble();

        double finalBalance = deposit(balance,amountD);

        System.out.println("Current Account Report");
        System.out.println("Name: " + fullName);
        System.out.println("You current balance: " + finalBalance);

        System.out.print("Enter amount to withdraw: ");
        double amountW = input.nextDouble();

        finalBalance = withdraw(finalBalance, amountW);

        System.out.println("Current Account Report");
        System.out.println("Name: " + fullName);
        System.out.println("You current balance: " + finalBalance);

        finalBalance = interest(finalBalance);
        System.out.println("Current Account Report");
        System.out.println("Name: " + fullName);
        System.out.println("You current balance: " + finalBalance);


    }


}
