package impl;

import java.text.DecimalFormat;

public class FahrenheitToCelsius {
    private double fahrenheit;
    private double celsius;
    DecimalFormat df = new DecimalFormat("#.#####");

    public double convertToCel(double fahrenheit){
        //Subtract 32 from the fahrenheit value
        //Multiply by 5/9 or .5556. 5/9 is ultimately more precise.
        celsius = (fahrenheit - 32) * (5.0/9.0);
        //Formatting and parse necessary to match decimals, types and decimal separator.
        return Double.parseDouble(df.format(celsius).replace(",","."));
    }

    public double convertToFahrenheit(double celsius){
        //Multiply by 1.8 or 9/5. 9/5 is more precise.
        //Add 32.
        fahrenheit = celsius * (9.0/5.0) + 32;
        //Formatting and parse necessary to match decimals, types and decimal separator.
        return Double.parseDouble(df.format(fahrenheit).replace(",","."));
    }

}
