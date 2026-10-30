package Unit1_UsingObjects;

/**
 * @author marilounanderson on 07/09/2026
 */
public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsiusTemp){
        double fahTemp = celsiusTemp * 1.8 + 32;
        return fahTemp;
    }
    public static double fahrenheitToCesius(double fahTemp){
        double celTemp = (fahTemp - 32) / 1.8;
        return celTemp;
    }

    //rounds a positive temperature
    public static int roundPositive(double temperature){
        return (int)(temperature + 0.5);
    }

    //rounds
    public static int roundNegative(double temperature){
        return (int)(temperature - 0.5);
    }


    static void main(){
        /**
         * Enter a positive temperature in Celsius: 25.5
         * Enter a negative temperature in Celsius: -6.5
         *
         * --- TEMPERATURE REPORT ---
         * Warm Temperature
         * Celsius: 25.5
         * Fahrenheit: 77.9
         * Rounded: 26
         *
         * Cold Temperature
         * Celsius: -6.5
         * Fahrenheit: 20.3
         * Rounded: -7
         *
         */





    }

}
