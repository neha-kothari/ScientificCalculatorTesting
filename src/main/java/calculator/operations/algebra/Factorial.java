package calculator.operations.algebra;

public class Factorial {

    public int factorial(int a) {
        if (a == 1 || a == 0) {
            return 1;
        } else if (a < 0) {
            return 0;
        } else
            return a * factorial(a - 1);
    }
}
