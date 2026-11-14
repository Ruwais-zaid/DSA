func solve(n int, dp []int) int  {

    if n<=0 {
        return 1;
    }
    if dp[n]!=-1 {
        return dp[n];

    }

    var count = 0;
    for i:=1;i<=n;i++ {
        count+=solve(i-1,dp)*solve(n-i,dp);
    }
    dp[n] = count;
    return dp[n];
}

func numTrees(n int) int {
    dp := make([]int, n+1);
    for i := range dp {
        dp[i] = -1;
    }

    var ans = solve(n,dp);
    return ans;
}