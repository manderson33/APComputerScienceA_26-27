package Unit1_UsingObjects.StaticMethods;

/**
 * @author marilounanderson on 20/10/2026
 */
public class Employee {
    //instance variables can be accessed through an object
    //the "this" keyword is used by instance variables
    private String name;
    private double salary;

    //static variables are Class variables, can be accessed through the class name
    //"this" keyword cannot be used in static variables
    //Use the class name instead
    private static double increase = 0.0;
    private static double tax = 0.0;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    //uses both static variables and non-static variables
    public double calculateSalary(){
        double increasedSalary = salary * (1 + increase);
        return increasedSalary * (1 - tax);
    }

    public static void setTax(double t){
        tax = t;
    }
    //only static variables are allowed in this method
    public static void increaseSalary(double percentage){
        increase = percentage / 100 ;
    }

}

class TestE{
    static void main(){
        //String is a class or reference type, the default value is null
        //Default value of objects is null
        //Default value of int is 0, 0.0 for double, false for boolean

        Employee e1 = new Employee("Marilou", 5000);
        Employee e2 = new Employee("Erik", 4900);

        Employee e3 = null;
        e3 = new Employee("Jen", 10000);
        Employee e4 = e2;
        e2 = new Employee("John", 9000);

        System.out.println(e1.getSalary());
        System.out.println(e2.getSalary());
        System.out.println(e3.getSalary());
        System.out.println(e4.getSalary());

        System.out.println("Salary Calculations....");
        Employee.setTax(0.1);
        Employee.increaseSalary(5);

        System.out.println(e1.calculateSalary());
        System.out.println(e2.calculateSalary());









    }
}
