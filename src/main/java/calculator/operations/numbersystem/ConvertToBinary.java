package calculator.operations.numbersystem;

import java.util.Scanner;

public class ConvertToBinary {

    public StringBuilder decimalToBinary(int i) {

        String number = new String("");
        StringBuilder newNumber = new StringBuilder();
        int x = i;
        while (x > 0) {
            int y = x % 2;
            number = number + Integer.toString(y);
            x = x / 2;
        }
        newNumber.append(number);
        newNumber.reverse();
        return newNumber;
    }

    public StringBuilder hexadecimalToBinary(String number) {

        StringBuilder newNumber = new StringBuilder();
        char ch;
        int i = number.length();
        for (int x = 0; x < i; x++) {
            ch = number.charAt(x);
            switch (ch) {
                case '0':
                    newNumber.append("0000");
                    break;
                case '1':
                    newNumber.append("0001");
                    break;
                case '2':
                    newNumber.append("0010");
                    break;
                case '3':
                    newNumber.append("0011");
                    break;
                case '4':
                    newNumber.append("0100");
                    break;
                case '5':
                    newNumber.append("0101");
                    break;
                case '6':
                    newNumber.append("0110");
                    break;
                case '7':
                    newNumber.append("0111");
                    break;
                case '8':
                    newNumber.append("1000");
                    break;
                case '9':
                    newNumber.append("1001");
                    break;
                case 'A':
                    newNumber.append("1010");
                    break;
                case 'B':
                    newNumber.append("1011");
                    break;
                case 'C':
                    newNumber.append("1100");
                    break;
                case 'D':
                    newNumber.append("1101");
                    break;
                case 'E':
                    newNumber.append("1110");
                    break;
                case 'F':
                    newNumber.append("1111");
                    break;
                default:
                    System.out.println("Input error");
            }
        }
        return newNumber;
    }

    public StringBuilder octalToBinary(String number) {
        char ch;
        StringBuilder newNumber = new StringBuilder();
        int i = number.length();
        for (int x = 0; x < i; x++) {
            ch = number.charAt(x);
            switch (ch) {
                case '0':
                    newNumber.append("000");
                    break;
                case '1':
                    newNumber.append("001");
                    break;
                case '2':
                    newNumber.append("010");
                    break;
                case '3':
                    newNumber.append("011");
                    break;
                case '4':
                    newNumber.append("100");
                    break;
                case '5':
                    newNumber.append("101");
                    break;
                case '6':
                    newNumber.append("110");
                    break;
                case '7':
                    newNumber.append("111");
                    break;
                default:
                    System.out.println("Input error"); }
        }
        return newNumber;
    }

    public void getInput() {

        Scanner input = new Scanner(System.in);
        System.out.println("Choose input type");
        System.out.println("1.Decimal...2.Hexadecimal...3.Octal");
        int n = input.nextInt();
        System.out.println("Enter the number");
        String number = input.next();
        menu(n, number);
    }

    public StringBuilder menu(int operation, String number) {
        if (operation == 1) {
            if (number.isEmpty()) {
                return new StringBuilder();
            }
            int i = Integer.valueOf(number);
            return decimalToBinary(i);

        } else if (operation == 2) {
            return hexadecimalToBinary(number);

        } else if (operation == 3) {
            return octalToBinary(number);
        }
        return new StringBuilder("Wrong Input!");
    }
}
