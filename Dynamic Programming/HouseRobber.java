public class HouseRobber {
    public static int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = nums[1];
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i]);
            if (i >= 3) {
                dp[i] = Math.max(dp[i - 3] + nums[i], dp[i]);
            }
        }

        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
