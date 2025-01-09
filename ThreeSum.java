import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); 
        List<List<Integer>> ans = new ArrayList<>();
        
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int l = i + 1;
            int r = nums.length - 1;
            
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > 0) {
                    r--; 
                } else if (sum < 0) {
                    l++; 
                } else {
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    
                    while (l < r && nums[l] == nums[l + 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r - 1]) {
                        r--;
                    }
                    
                    l++;
                    r--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}
