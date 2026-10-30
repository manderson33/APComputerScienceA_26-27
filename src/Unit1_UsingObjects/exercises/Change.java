package Unit1_UsingObjects.exercises;

import java.util.Scanner;

/**
 * @author marilounanderson on 27/08/2026
 */
public class Change
{
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the change in cents: ");
        int cents = input.nextInt();

        int quarters = cents / 25;  //8
        cents = cents % 25;         //12

        int dimes = cents / 10;     //1
        cents = cents % 10;         //2

        int nickels = cents / 5;    //0
        cents = cents % 5;          //2

        int pennies = cents;

        System.out.println("Quarters " + quarters);
        System.out.println("Dimes " + dimes);
        System.out.println("Nickels " + nickels);
        System.out.println("Pennies " + pennies);


        
    }
}
