class Solution {
    public static int climb(int dp[],int n){
        //base case;
        if(n==0){
            return 1;
        }
        if(n==-1){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=climb(dp,n-1)+climb(dp,n-2);
        return dp[n];
    }
    public int climbStairs(int n) {
       int dp[]=new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return climb(dp,n);
        
    }
}