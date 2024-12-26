import java.util.HashSet;

class ContainsDuplicate {
    public static boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 3 };
        int nums2[] = { 1, 2, 3, 4 };
        System.out.println(hasDuplicate(nums1));
        System.out.println(hasDuplicate(nums2));
    }
}