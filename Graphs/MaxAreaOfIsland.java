public class MaxAreaOfIsland {
    private static int dfs(int row, int col, int[][] grid) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 0) {
            return 0;
        }

        grid[row][col] = 0;
        return 1 + dfs(row + 1, col, grid) + dfs(row - 1, col, grid) + dfs(row, col + 1, grid) + dfs(row, col - 1, grid);
    }

    public static int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    ans = Math.max(ans, dfs(i, j, grid));
                }
            }
        }
        return ans;
    }
}
