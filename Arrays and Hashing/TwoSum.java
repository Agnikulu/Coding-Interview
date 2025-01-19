import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int ans[] = { -99999999, -99999999 };
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashmap.containsKey(target - nums[i])) {
                ans[0] = hashmap.get(target - nums[i]);
                ans[1] = i;
                return ans;
            }
            hashmap.put(nums[i], i);
        }
        return ans;
    }
}
