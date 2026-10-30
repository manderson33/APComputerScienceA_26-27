package Unit1_UsingObjects;

/**
 * @author marilounanderson on 27/08/2026
 */
public class Expressions {
    static void main(){
        // % is a modulus operator, finds the remainder of a division
        int x = 2, y = 5;
        int remainder = x % y; //find the remainder
        System.out.println(remainder);
        //update the value of remainder
        remainder = y % x;
        System.out.println(remainder);

        int z = x / y;
        System.out.println(z); //integer division

        //casting is converting one data type to another
        double m = x / (double)y;
        System.out.println(m);

    }

}
