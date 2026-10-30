package Unit1_UsingObjects.Rectangle;

/**
 * @author marilounanderson on 21/09/2026
 */
public class Rectangle {
    //instance variables
    //private - cannot be accessed outside of this class
    private double length;
    private double width;

    //Constructor
    //allows for providing initial values to the instance variables
    //is used to create object
    //does not return a value, is named after the name of the class
    //always public
    public Rectangle(double l, double w){
        length = l;
        width = w;
    }

    /**
     *
     * @return return area of rectangle
     */
    public double getArea(){
        double area = length * width;
        return area;
    }



    @Override
    public String toString() {
        return "Rectangle " +
                "length: " + length +
                ", width: " + width;
    }
}

class TestRectangle{
    static void main(){
        Rectangle rect1 = new Rectangle(10, 30);
        System.out.println(rect1.toString());
        System.out.println("Area of rect 1: " + rect1.getArea());

        Rectangle rect2 = new Rectangle(100, 200);
        System.out.println(rect2.toString());
        System.out.println("Area of rect 2: " + rect2.getArea());

    }
}
