import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        int minNum = 1000000001;
        HashSet<Integer> hashset = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            hashset.add(nums[i]);
            if (nums[i] < minNum) {
                minNum = nums[i];
            }
        }

        int ans = 0;
        for (int num : hashset) {
            if (!hashset.contains(num - 1)) { 
                int len = 0;
                while (hashset.contains(num + len)) {
                    len++;
                }
                if (len > ans) {
                    ans = len;
                }
            }
        }
        return ans;
    }
}
