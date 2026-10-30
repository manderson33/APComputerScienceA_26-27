package Unit1_UsingObjects;
import java.util.Scanner;

/**
 * @author marilounanderson on 21/08/2026
 */
public class UserInput {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of length: ");
        double length = input.nextDouble();

        System.out.print("Enter value of width: ");
        double width = input.nextDouble();

        double perimeter = 2 * (length + width);
        double area = length * width;

        //the + sign is for concatenation
        //joining a string with the variable
        System.out.println("Perimeter " +  perimeter);
        System.out.println("Area: " + area);

    }
}
