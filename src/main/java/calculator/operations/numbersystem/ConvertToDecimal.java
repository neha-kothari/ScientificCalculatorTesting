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
                System.out.println(octal());
                break;
            case 2:
                System.out.println(binary());
                break;
            case 3:
                System.out.println(hexadecimal());
                break;

        }
    }

    int octal() {
        int n = 0, decimal = 0, octa = -1;
        System.out.println("Enter the Octal Number : ");
        int bin = in.nextInt();
        int t = 0;
        int b = bin;
        if (b >= 0) {
            while (t <= 8 && b != 0) {
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
                    decimal += temp * Math.pow(8, n);
                    bin = bin / 10;
                    n++;
                }
            }
        } else
            System.out.println("Error");
        return decimal;
    }

    int binary() {
        int n = 0, decimal = 0, octa = -1;
        System.out.println("Enter the Binary Number : ");
        int bin = in.nextInt();
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
            System.out.println("Error");
        return decimal;
    }

    int hexadecimal() {
        String hexdec_num = "";
        int dec_num = 0, k = 1;
        System.out.println("Input a hexadecimal number: ");
        Scanner obj = new Scanner(System.in);
        hexdec_num = obj.nextLine();
        String digits = "0123456789ABCDEF";
        hexdec_num = hexdec_num.toUpperCase();
        for (k = 0; k < hexdec_num.length(); k++) {
            char cr = hexdec_num.charAt(k);
            int d = digits.indexOf(cr);
            dec_num = 16 * dec_num + d;
        }
        return dec_num;
    }
}
