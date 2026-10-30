package Unit1_UsingObjects;

import java.util.Scanner;

/**
 * @author marilounanderson on 03/09/2026
 */
public class Student {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter course you're enrolled in: ");
        String course = input.nextLine(); //multiple words input

        System.out.print("Enter first name: ");
        String fName = input.next(); //single word input

        System.out.print("Enter age: ");
        int age = input. nextInt(); //integer input

        System.out.print("Enter GPA: ");
        double gpa = input.nextDouble(); //decimal input

        System.out.print("Did you pass the PSAT? true | false ");
        boolean pass = input.nextBoolean(); //boolean input


    }
}
