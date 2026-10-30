package Unit1_UsingObjects.exercises;

import java.util.Scanner;

/**
 * @author marilounanderson on 01/09/2026
 */
public class TimeConversion {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter time in minutes: ");
        int time = input.nextInt();

        int hours  = time / 60;
        time = time % 60;

        int tens = time / 10;
        time = time % 10;

        int ones = time;

        System.out.println("The time " + hours + ":" + tens + ones);
    }
}
