public class TwoIntegerSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            if (numbers[l] + numbers[r] < target) {
                l++;
            } else if (numbers[l] + numbers[r] > target) {
                r--;
            } else {
                return new int[] {l + 1, r + +1};
            } 
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4};
        int target = 3;

        int ans[] = twoSum(numbers, target);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
