package Unit1_UsingObjects.exercises;

import java.util.Scanner;

/**
 * @author marilounanderson on 01/09/2026
 */
public class Digits {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int number = input.nextInt();

        int hundreds = number / 100;
        number = number % 100;

        int tens = number / 10;
        number = number % 10;

        int ones = number;

        System.out.println("Hundreds " + hundreds);
        System.out.println("Tens " + tens);
        System.out.println("Ones " + ones);


    }
}
