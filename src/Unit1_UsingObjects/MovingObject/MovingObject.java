package Unit1_UsingObjects.MovingObject;

/**
 * @author marilounanderson on 22/09/2026
 */
public class MovingObject {
    //attributes >> instance variables
    private String name;
    private double mass;
    private double distance;
    private double time;

    //Constructor - sets values for 4 instance variables
    public MovingObject(String n, double m, double d, double t){
        name = n;
        mass = m;
        distance = d;
        time = t;
    }
    //no-parameter constructor //no-argument constructor
    public MovingObject(){
        name = "Ball";
        mass = 0.2;
        distance = 50;
        time = 3;
    }

    public double getVelocity(){
        return distance / time;
    }

    public double getKE(){
        return 1 / (double)2 * mass * Math.pow(getVelocity(), 2);
    }

    @Override
    public String toString(){
        return "Object name: " + name +
                "\nObject mass: " + mass +
                "\nVelocity: " + getVelocity() +
                "\nKE: " + getKE();
    }
}

class TestMO{
    static void main(){

    }
}
