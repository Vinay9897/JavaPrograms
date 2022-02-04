import java.util.Scanner;

public class LRSUsingDP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println(LRSUsingDP(str));

    }

    public static int LRSUsingDP(String str) {
        int s = 0;
        int[][] dp = new int[str.length() + 1][str.length() + 1];

        for (int i = str.length() - 1; i >= 0; i--) {
            for (int j = dp[0].length - 1; j >= 0; j--) {
                if ((i == dp.length - 1) && (j == dp[0].length - 1)) {
                    dp[i][j] = 0;
                } else if (i == dp.length - 1) {
                    dp[i][j] = 0;
                } else if (j == dp.length - 1) {
                    dp[i][j] = 0;
                } else {
                    if (str.charAt(i) == str.charAt(j) && i != j) {
                        dp[i][j] = dp[i][j] + 1;
                        s = dp[i][j];
                    } else
                        dp[i][j] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                    s = dp[i][j];
                }

            }
        }
        return s;
    }
}
