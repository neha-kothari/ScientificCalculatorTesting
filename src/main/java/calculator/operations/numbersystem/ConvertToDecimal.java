package calculator.operations.numbersystem;

import java.util.Scanner;

public class ConvertToDecimal {

    Scanner in = new Scanner(System.in);

    public void convertToDecimal() {

        System.out.println("\n\tOctal Convertor");
        System.out.println("\t----------- ---------");
        System.out.print("	1. Octal to Decimal\n	2. Binary to Decimal\n	3. Hexadecimal to Decimal\n 	Enter Your Choice : ");
        int n = in.nextInt();
        switch (n) {
            case 1:
                System.out.println("Enter the Octal Number : ");
                int oct = in.nextInt();
                System.out.println(octal(oct));
                break;
            case 2:
                System.out.println("Enter the Binary Number : ");
                int bin = in.nextInt();
                System.out.println(binary(bin));
                break;
            case 3:
                System.out.println("Enter the Hexadecimal Number : ");
                String hexa = in.next();
                System.out.println(hexadecimal(hexa));
                break;

        }
    }

    String octal(int oct) {
        int n = 0, decimal = 0, octa = -1;
        int bin = oct;
        int t = 0;
        int b = bin;
        if (b >= 0) {
            while (t < 8 && b > 0) {
                t = b % 10;
                b = b / 10;
            }

            if (t >= 8 || b < 0) {
                return "Error";
            }
        }
        if (b == 0) {
            while (true) {
                if (bin == 0) {
                    break;
                } else {
                    int temp = bin % 10;
                    decimal += temp * Math.pow(8, n);
                    bin = bin / 10;
                    n++;
                }
            }
        } else
            return "Error";
        return decimal + "";
    }

    String binary(int bin) {
        int n = 0, decimal = 0, octa = -1;
        int t = 0;
        int b = bin;
        if (b >= 0) {
            while (t == 0 || t == 1 && b != 0) {
                t = b % 10;
                b = b / 10;
            }
        }
        if (b == 0) {
            while (true) {
                if (bin == 0) {
                    break;
                } else {
                    int temp = bin % 10;
                    decimal += temp * Math.pow(2, n);
                    bin = bin / 10;
                    n++;
                }
            }
        } else
            return "Error";
        return decimal + "";
    }

    String hexadecimal(String hexdec_num) {

        int dec_num = 0, k = 1;
        String digits = "0123456789ABCDEF";
        hexdec_num = hexdec_num.toUpperCase();
        for (k = 0; k < hexdec_num.length(); k++) {
            char cr = hexdec_num.charAt(k);
            if (!Character.isDigit(cr) && !(cr == 'A' || cr == 'B' || cr == 'C' || cr == 'D' || cr == 'E' || cr == 'F')) {
                return "Error";
            }
            int d = digits.indexOf(cr);
            dec_num = 16 * dec_num + d;
        }
        return dec_num + "";
    }
}
