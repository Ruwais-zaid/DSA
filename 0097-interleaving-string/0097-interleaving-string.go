func solve(i, j int, s1, s2, s3 string, dp [][]int) bool {
    if i == len(s1) && j == len(s2) {
        return true
    }

    if dp[i][j] != -1 {
        return dp[i][j] == 1
    }

    possible := false
    k := i + j

    if i < len(s1) && s1[i] == s3[k] {
        possible = solve(i+1, j, s1, s2, s3, dp)
    }
    if !possible && j < len(s2) && s2[j] == s3[k] {
        possible = solve(i, j+1, s1, s2, s3, dp)
    }

    if possible {
        dp[i][j] = 1
    } else {
        dp[i][j] = 0
    }
    return possible
}


func isInterleave(s1 string, s2 string, s3 string) bool {
    m, n := len(s1), len(s2)

	if len(s3) != m+n {
        return false;
	}
dp := make([][]int, m+1)
for i := range dp {
    dp[i] = make([]int, n+1)
    for j := range dp[i] {
        dp[i][j] = -1 
    }
}


	ans := solve(0, 0, s1, s2, s3, dp)
    return ans;
}