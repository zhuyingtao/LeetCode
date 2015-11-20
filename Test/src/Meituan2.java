/**
 * Created by zyt on 15/10/11 12:22.
 */
public class Meituan2 {

    public long getNumberOfCombinations(int N) {
        int[] coins = {1, 5, 10, 20, 50, 100};
        long[][] dp = new long[coins.length + 1][N + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 0; k <= j / coins[i - 1]; k++)
                    dp[i][j] += dp[i - 1][j - k * coins[i - 1]];

            }
        }
        return dp[coins.length][N];
    }

    public static void main(String[] args) {

    }
}
