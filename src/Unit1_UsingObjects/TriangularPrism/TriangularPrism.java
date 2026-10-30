package Unit1_UsingObjects.TriangularPrism;

/**
 * @author marilounanderson on 28/09/2026
 */
public class TriangularPrism {
    private double length;
    private double height;
    private double base;

    public TriangularPrism(double length, double height, double base) {
        this.length = length;
        this.height = height;
        this.base = base;
    }

    public double getVolume(){
        return((1.0/2.0) * base * height) * length;
    }
}
