package Unit1_UsingObjects;

/**
 * @author marilounanderson on 11/09/2026
 */
public class RandomDemo {
    static void main(){
        //generates a random number between 0 and < 1
        double num1 = Math.random();
        System.out.println(num1);

        //0 up to less than 5
        int num2 = (int)(Math.random() * 5);
        System.out.println(num2);

        //(Math.radom() * (High - Low + 1)) + Low
        int num3 = (int)(Math.random() * (100 - 50 + 1) + 50);
        System.out.println(num3);

    }
}
