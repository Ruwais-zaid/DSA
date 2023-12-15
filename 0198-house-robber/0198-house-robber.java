class Solution {
     public static int solve(int arr[],int dp[],int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return arr[0];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int inclu=solve(arr,dp,n-2)+arr[n];
        int exclu=solve(arr,dp,n-1)+0;
        dp[n]=Math.max(inclu,exclu);
        return dp[n];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        for(int i=0;i<n;i++) {
            dp[i] = -1;
        }
        return solve(nums,dp,n-1);
        
    }
}