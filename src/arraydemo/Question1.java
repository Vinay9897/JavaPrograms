package arraydemo;

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        String str = "abbac";
        int left = 0;
        int right = 0;
        int len = str.length();
        char[] s = str.toCharArray();
        int[] farr = new int[256];
        int size = 0;

        Arrays.fill(farr, -1);
        while (right < len) {
            if (farr[s[right]] != -1) {
                left = Math.max(left, farr[s[right]] + 1);

            }
            farr[s[right]] = right;
            size = Math.max(size, right - left + 1);
            right++;
        }
        System.out.println("length : " + size);

    }
}