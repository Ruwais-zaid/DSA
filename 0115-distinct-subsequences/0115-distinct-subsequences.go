func solve(i, j, m, n int, s1, s2 string, dp [][]int) int {
	if i == m || j == n {
		if j == n {
			return 1
		}
		return 0
	}

	if dp[i][j] != -1 {
		return dp[i][j]
	}

	ways := solve(i+1, j, m, n, s1, s2, dp)

	if s1[i] == s2[j] {
		ways += solve(i+1, j+1, m, n, s1, s2, dp)
	}

	dp[i][j] = ways
	return dp[i][j]
}
func numDistinct(s string, t string) int {
    m := len(s)
	n := len(t)

	 dp := make([][]int, m+1)
	 for i := range dp {
		dp[i] = make([]int, n+1)
		for j := range dp[i] {
			dp[i][j] = -1
		}
	 }




	 ans := solve(0, 0, m, n, s, t, dp)
     return ans;
    
}