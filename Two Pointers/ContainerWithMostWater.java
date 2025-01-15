public class ContainerWithMostWater {
    public static int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int ans = 0;
        while (l < r) {
            ans = Math.max(ans, (r - l) * Math.min(heights[l], heights[r]));
            if (heights[l] > heights[r]) {
                r--;
            } else {
                l++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int heights1[] = {1, 7, 2, 5, 4, 7, 3, 6};
        int heights2[] = {2, 2, 2};
        System.out.println(maxArea(heights1));
        System.out.println(maxArea(heights2));
    }
}
