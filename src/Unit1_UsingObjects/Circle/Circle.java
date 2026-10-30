package Unit1_UsingObjects.Circle;

import java.util.Scanner;

/**
 * @author marilounanderson on 21/09/2026
 */
public class Circle {
    //instance variable/s
    private double radius;

    //having multiple constructors is called constructor overloading
    //constructor
    public Circle(double r){
        radius = r;
    }
    //no-argument/parameter constructor
    public Circle(){
        radius = 100;
    }

    //accessor - allows user to access actual value of the instance variables
    public double getRadius() {
        return radius;
    }
    //mutator - allows user to change the actual value of the instance variables
    public void setRadius(double radius) {
        this.radius = radius;
    }
    //getArea
    public double getArea(){
        return Math.pow(radius, 2) * Math.PI;
    }
    //getCircumference
    public double getCircumference(){
        double circumference = 2 * radius * Math.PI;
        return circumference;
    }
    //toString
    @Override
    public String toString() {
        return "radius: " + radius +
                "\nArea: " + getArea() +
                "\nCircumference: " + getCircumference();
    }
}

//test class
class TestCircle{
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of a circle: ");
        double r = input.nextDouble();

        Circle c1 = new Circle(r);

        System.out.println(c1);

        System.out.print("Enter new value of radius: ");
        double r2 = input.nextDouble();
        c1.setRadius(r2);
        System.out.println(c1);

        System.out.println("Radius of the circle: ");
        //shows that getRadius() can be used in outside calculation
        double area = Math.PI * Math.pow(c1.getRadius(),2);


        Circle c2 = new Circle();
        System.out.println(c2);

    }
}