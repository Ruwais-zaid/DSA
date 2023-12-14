class Solution {
    public static int nclimb(int[] dp,int[] cost,int n){
        //base case;
        if(n==0){
            return cost[0];
        }
        if(n==1){
            return cost[1];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=Math.min(nclimb(dp,cost,n-1),nclimb(dp,cost,n-2))+cost[n];
        return dp[n];    
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int arr[]=new int[n+1];
        for(int i=0;i<arr.length;i++){
            arr[i]=-1;
        }
        int ans=Math.min(nclimb(arr,cost,n-1),nclimb(arr,cost,n-2));
        return ans;
    }
}