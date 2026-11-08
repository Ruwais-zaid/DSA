import java.util.*;

class Solution {

    public static int calculateRectangle(int[] heights, Stack<Integer> stack) {
        stack.clear();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int currentHeight = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }

            if (i < n) {
                stack.push(i);
            }
        }

        return maxArea;
    }

    public static int maxRectangleArea(int[][] heights, int rows) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i < rows; i++) {
            maxArea = Math.max(maxArea, calculateRectangle(heights[i], stack));
        }

        return maxArea;
    }

    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int height[][] = new int[rows][cols];
        int consicutive[] = new int[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                consicutive[j] = (matrix[i][j] == '1' ? consicutive[j] + 1 : 0);
                height[i][j] = consicutive[j];
            }
        }

        return maxRectangleArea(height, rows);
    }
}