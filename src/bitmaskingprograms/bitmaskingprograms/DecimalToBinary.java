package bitmaskingprograms;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any Decimal Number:");
        int decimal = sc.nextInt();
        int binary = 0;
        int n = 0;
        sc.close();
        String str = "";
        while (true) {
            if (decimal == 0) {
                break;
            }
            int temp = decimal % 16;
            if (temp == 10)
                temp = (int) 'A';

            if (temp == 11)
                temp = (int) 'B';
            if (temp == 12)
                temp = (int) 'C';
            if (temp == 13)
                temp = (int) 'D';
            if (temp == 14)
                temp = (int) 'E';
            if (temp == 15)
                temp = (int) 'F';
            str = temp + str;
            decimal = decimal / 16;
        }

        System.out.println(str);
    }
}
