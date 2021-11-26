package calculator.operations.conversion;

import java.util.Scanner;

public class Temperature {
    double temp;
    String fromUnit;
    String toUnit;

    public Temperature() {
    }

    public void run() {
        getInput();
        double result = convertTemperature(toUnit, fromUnit, temp);
        System.out.println("Your answer is " + result + fromUnit );
    }

    private void getInput() {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter Original Temperature:");
        temp = scannerObject. nextDouble();

        Scanner UserInput = new Scanner(System.in);
        System.out.println("Enter your current unit (F/C/K):");
        fromUnit = UserInput.next();
        System.out.println("Enter unit to convert to (F/C/K):");
        toUnit = UserInput.next();
    }


    public double convertTemperature(String toUnit, String fromUnit, double temp) {

        if(toUnit.equals(fromUnit))
            return temp;
        if(toUnit.toLowerCase().equals("k") && fromUnit.toLowerCase().equals("c") )
        {
            return (temp + 273.15);
        }
        if(toUnit.toLowerCase().equals("c") && fromUnit.toLowerCase().equals("k") )
        {
            return (temp - 273.15);
        }
        if(toUnit.toLowerCase().equals("k") && fromUnit.toLowerCase().equals("f") )
        {
            return ( 273.5 + ((temp - 32.0) * (5.0/9.0)));
        }
        if(toUnit.toLowerCase().equals("f") && fromUnit.toLowerCase().equals("k") )
        {
            return  ((9.0 / 5) * (temp - 273.15) + 32);
        }
        if(toUnit.toLowerCase().equals("c") && fromUnit.toLowerCase().equals("f") )
        {
            return   (((temp - 32) * 5) / 9.0);
        }
        if(toUnit.toLowerCase().equals("f") && fromUnit.toLowerCase().equals("c") )
        {
            return ((temp * 9.0 / 5.0) + 32.0);
        }
        throw new IllegalStateException("Math toUnit is not valid");
    }
}
