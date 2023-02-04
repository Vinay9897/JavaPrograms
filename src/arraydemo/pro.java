import java.util.Arrays;

public class pro {
    public static void main(String[] args) {
        int[] banned = { 87, 193, 85, 55, 14, 69, 26, 133, 171, 180, 4, 29, 121,
                182, 78, 157, 53, 26, 7, 117, 138, 57, 167, 8, 103, 32, 110,
                15, 190, 139, 16, 49, 138, 68, 69, 92, 89, 140, 149, 107,
                104, 2, 135, 193, 87, 21, 194, 192, 9, 161, 188, 73, 84, 83, 31, 86,
                33, 138, 63, 127, 73, 114, 32, 66, 64, 19, 175, 108, 80, 176, 52,
                124, 94, 33, 55, 130, 147, 39, 76, 22, 112, 113, 136, 100, 134,
                155, 40, 170, 144, 37, 43, 151, 137, 82, 127, 73 };
        int n = 1079;
        int maxSum = 87;
        System.out.println(maxCount(banned, n, maxSum));

    }

    public static int maxCount(int[] banned, int n, int maxSum) {
        int count = 0;
        Arrays.sort(banned);
        int len = banned.length;
        int j = 1;
        int sum = 0;
        for (int val : banned)
            System.out.print(val + " ");
        for (int i = 1; i <= n; i++) {
            boolean flag = false;
            if (j < len) {
                if (banned[j - 1] == i || banned[j] == banned[j - 1]) {
                    j++;
                    flag = true;
                }
            }
            if (!flag && sum + i < maxSum) {
                sum += i;
                count++;
            }

        }
        System.out.println(sum);

        return count;

    }
}