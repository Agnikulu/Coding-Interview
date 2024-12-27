import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int n = nums.length;
        int[] ans = new int[k];
        ArrayList<ArrayList<Integer>> numsAtFreq = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            numsAtFreq.add(new ArrayList<>());
        }
        for (Integer num : freq.keySet()) {
            numsAtFreq.get(freq.get(num)).add(num);
        }

        for (int i = n; i > 0; i--) {
            ArrayList<Integer> occAtI = numsAtFreq.get(i);
            while (k > 0 && !occAtI.isEmpty()) {
                ans[--k] = occAtI.remove(occAtI.size() - 1);
            }
        }
        return ans;
    }   

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 3, 3, 3 };
        int k1 = 2;
        int[] nums2 = { 7, 7 };
        int k2 = 1;
        System.out.println(Arrays.toString(topKFrequent(nums1, k1)));
        System.out.println(Arrays.toString(topKFrequent(nums2, k2)));
    }
}
