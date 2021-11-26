package calculator.operations.algebra;

import java.util.Scanner;

public class Arithmetic {
    double number1, number2;
    String operation;

    public Arithmetic() {
    }

    public void run() {
        getInput();
        String result = doMath(operation, number1, number2 );
        System.out.println("Your answer is " + result );
    }

    private void getInput() {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter first number");
        number1 = scannerObject. nextDouble();
        System.out.println("Enter second number");
        number2 = scannerObject. nextDouble();

        Scanner UserInput = new Scanner(System.in);
        System.out.println("\nHere are your options:");
        System.out.println("\n1. Addition, 2. Subtraction, 3. Division, 4. Multiplication");
        operation = UserInput.next();
    }


    public String  doMath(String operation, double number1, double number2) {
        switch (operation)
        {
            case "1":
                return (number1 + number2) + "";

            case "2":
                return  (number1 - number2) + "";

            case "3":
                return (number1 / number2) + "";

            case "4":
                return (number1 * number2) + "";

            default:
                return "Invalid Input";
        }
    }
}
