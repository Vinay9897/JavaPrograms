package bitmaskingprograms;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number");
        int binary = sc.nextInt();
        int decimal = 0;
        int n = 0;
        while (true) {
            if (binary == 0) {
                break;
            }
            int temp = binary % 10;
            decimal += temp * Math.pow(8, n);
            n += 1;
            binary = binary / 10;
        }
        System.out.println("Decimal number is:" + decimal);
    }
}