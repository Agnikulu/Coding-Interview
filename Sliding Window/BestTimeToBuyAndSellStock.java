public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int start = 0;
        int ans = 0;
        for (int end = 0; end < prices.length; end++) {
            if (prices[end] > prices[start]) {
                ans = Math.max(prices[end] - prices[start], ans);
            } else {
                start = end;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int prices[] = {10, 1, 5, 6, 7, 1};
        System.out.println(maxProfit(prices));
    }
}
