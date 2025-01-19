public class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        final int OVER_MAX_COIN_VALUE = 99999;
        int dp[] = new int[amount +  1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = OVER_MAX_COIN_VALUE;
        }

        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0) { 
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }

        if (dp[amount] == OVER_MAX_COIN_VALUE) {
            return -1;
        }
        return dp[amount];
    }
}
