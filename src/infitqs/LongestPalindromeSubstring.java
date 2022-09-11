package infitq;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {

        String str = "";
        int len = str.length();
        int maxlen = 0;
        String sub = "";
        boolean[][] dp = new boolean[len][len];
        if (str.length() > 0) {
            for (int gap = 0; gap < len; gap++) {
                for (int i = 0, j = gap; j < dp.length; i++, j++) {
                    if (gap == 0) {
                        dp[i][j] = true;

                    } else if (gap == 1) {
                        dp[i][j] = str.charAt(i) == str.charAt(j);

                    } else {
                        if (str.charAt(i) == str.charAt(j) && dp[i + 1][j - 1] == true) {
                            dp[i][j] = true;

                        } else {
                            dp[i][j] = false;
                        }
                    }
                    if (dp[i][j] == true) {
                        maxlen = gap + 1;
                        sub = str.substring(i, j + 1);
                    }
                }
            }

            System.out.println(sub);
            System.out.println(maxlen);
        }
    }

}
