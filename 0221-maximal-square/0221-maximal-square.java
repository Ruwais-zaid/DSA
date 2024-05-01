class Solution {
    
    public int maximalSquare(char[][] matrix) {
         if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
        return 0;
    }
    
    int m = matrix.length;
    int n = matrix[0].length;
    int[][] dp = new int[m][n];
    int maxSquareSize = 0;
    
    // Initialize the first row and first column of dp array
    for (int i = 0; i < m; i++) {
        dp[i][0] = matrix[i][0] - '0';
        maxSquareSize = Math.max(maxSquareSize, dp[i][0]);
    }
    for (int j = 0; j < n; j++) {
        dp[0][j] = matrix[0][j] - '0';
        maxSquareSize = Math.max(maxSquareSize, dp[0][j]);
    }
    
    // Calculate dp array for remaining cells
    for (int i = 1; i < m; i++) {
        for (int j = 1; j < n; j++) {
            if (matrix[i][j] == '1') {
                dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1])) + 1;
                maxSquareSize = Math.max(maxSquareSize, dp[i][j]);
            }
        }
    }
    
    // Return area of the largest square
    return maxSquareSize * maxSquareSize;
}
        
    
}