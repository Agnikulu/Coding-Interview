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

    public static void main(String[] args) {
        int nums1[] = { 3, 4, 5, 6 };
        int target1 = 7;
        int nums2[] = { 4, 5, 6 };
        int target2 = 10;
        int[] ans0 = twoSum(nums1, target1);
        int[] ans1 = twoSum(nums2, target2);
        System.out.println(ans0[0] + " " + ans0[1]);
        System.out.println(ans1[0] + " " + ans1[1]);
    }
}
