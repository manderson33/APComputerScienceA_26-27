package Unit1_UsingObjects.Constructors;

/**
 * @author marilounanderson on 30/09/2026
 * a class will always have an implicit no-argument constructor
 * when a class uses a constructor with parameters, then the no argument
 * constructor should be explicitly written if needed
 *
 * The Math class contains only static methods
 * therefore there is no need to create objects
 * You can call the method with the class name e.g. Math.sqrt(), Math.pow()
 * Math.random()
 *
 */
public class Pyramid {
    private double base;
    private double height;

    public Pyramid(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Pyramid() {
        base = 6;
        height = 8;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBaseArea(){
        return base * base;
    }

    public double getVolume(){
        return(getBaseArea() * height) / 3.0;
    }
    //Math contains static methods only
    //You don't need to declare an object to call its methods
    public double getSurfaceArea(){
        double slantHeight = Math.sqrt(Math.pow(base/2, 2) + Math.pow(height, 2));
        return getBaseArea() + base * slantHeight;
    }
}

class TestPyramid{
    static void main(){
        //calls to the implicit no-arg constructor
        Pyramid p1 = new Pyramid();
        p1.setBase(6);
        p1.setHeight(8);

        System.out.println("base area: " + p1.getBaseArea());
        System.out.println("Volume: " + p1.getVolume());
        System.out.println("Surface area: " + p1.getSurfaceArea());
    }
}


