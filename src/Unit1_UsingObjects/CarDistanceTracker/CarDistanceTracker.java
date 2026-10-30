package Unit1_UsingObjects.CarDistanceTracker;

/**
 * @author marilounanderson on 30/09/2026
 *
 * If method is void, you cannot call it in System.out.print()
 * void methods do not return a value
 * static methods are only available to a class, NOT to objects
 *
 */
public class CarDistanceTracker {
    //instance variables
    //Each car object gets its own copy of these variables
    private String model;
    private double milesDriven;

    public CarDistanceTracker(String model){
        this.model = model;
        this.milesDriven = 0;
    }
    public void drive(double miles){
        milesDriven += miles;
    }
    public void displayDistance(){
        System.out.println(model + " has driven "
        + milesDriven + " miles");
    }

    public static double milesToKilometers(double miles){
        return miles * 1.60934;
    }

}

class TestCar{
    static void main(){
        CarDistanceTracker c1 = new CarDistanceTracker("BMW E5");
        c1.drive(150);
        c1.drive(300);
        c1.displayDistance();
        System.out.println(CarDistanceTracker.milesToKilometers(100));
    }
}
