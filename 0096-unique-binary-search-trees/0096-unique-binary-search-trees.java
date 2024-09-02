class Solution {
     public static int solve(int a,int dp[]){
        if(a<=1){
            return 1;
        }
        if (dp[a]!=-1){
            return  dp[a];
        }
        int ans=0;
        for(int i=1;i<=a;i++){
            ans+=solve(i-1,dp)*solve(a-i,dp);
        }
        dp[a]=ans;
        return dp[a];
    }
    public int numTrees(int n) {
         int dp[]= new int [n+1];

        Arrays.fill(dp,-1);
        int ans = solve(n,dp);
        return ans;
        
    }
}