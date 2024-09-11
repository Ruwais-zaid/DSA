class Solution {
    // Solve the problem using recursion with memoization
    public static int solve(int dice, int face, int target, int dp[][]) {
        // Base case: If the target is negative, no solution is possible
        if (target < 0) {
            return 0;
        }
        
        // If there are no dice left but target is not zero, no solution possible
        if (dice == 0 && target != 0) {
            return 0;
        }
        
        // If there are dice left but target is zero, no solution possible
        if (dice != 0 && target == 0) {
            return 0;
        }
        
        // Base case: If no dice and target is zero, we've found a valid combination
        if (dice == 0 && target == 0) {
            return 1;
        }

        // If the result is already calculated, return the cached value
        if (dp[dice][target] != -1) {
            return dp[dice][target];
        }

        // Calculate the number of ways to roll the dice to reach the target
        int ans = 0;
        for (int i = 1; i <= face; i++) {
            ans = (ans + solve(dice - 1, face, target - i, dp)) % 1000000007;
        }

        // Store the result in the memoization table
        dp[dice][target] = ans;
        return ans;
    }

    public int numRollsToTarget(int n, int k, int target) {
        // Create a memoization table and initialize it with -1
        int dp[][] = new int[n + 1][target + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        // Call the recursive solve function and return the result modulo 1000000007
        return solve(n, k, target, dp);
    }
}
