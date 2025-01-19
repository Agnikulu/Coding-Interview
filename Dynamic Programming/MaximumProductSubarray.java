public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        int ans = nums[0];
        int currMin = 1, currMax = 1;
        for (int num : nums) {
            int tmp = currMax * num;
            currMax = Math.max(Math.max(currMax * num, currMin * num), num);
            currMin = Math.min(Math.min(tmp, currMin * num), num);
            ans = Math.max(ans, currMax);
        }
        return ans;
    }
}
