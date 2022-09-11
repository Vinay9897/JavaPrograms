// package arraydemo;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestRSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String st1 = sc.nextLine();
        sc.close();
        ArrayList<String> str = printLongestRSequence(st1);
        System.out.println(str);

    }

    public static ArrayList<String> printLongestRSequence(String str) {
        ArrayList<String> myResult = new ArrayList<>();
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");

        }
        char ch = str.charAt(0);
        String st = str.substring(1);

        ArrayList<String> reResult = printLongestRSequence(st);

        for (String resultstring : reResult) {
            myResult.add("" + resultstring);
        }
        for (String resultstring : reResult) {
            myResult.add(ch + resultstring);

        }
        return myResult;

    }
}