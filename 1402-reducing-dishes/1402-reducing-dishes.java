class Solution {
     public static int solve(int [] arr,int i,int n,int time,int [][] dp){
        //base case
        if(i==n){
            return 0;
        }
        //base case
        if(dp[i][time]!=-1){
            return dp[i][time];
        }
        int include =arr[i]*(time+1)+solve(arr,i+1,n,time+1,dp);
        int exclude=0+solve(arr,i+1,n,time,dp);
        return dp[i][time]=Math.max(include,exclude);

    }
    public int maxSatisfaction(int[] satisfaction) {
        int[] arr=satisfaction;
         Arrays.sort(arr);
        int n= arr.length;
        int [][] dp=new int[n+1][n+1];
        for (int i=0;i<n;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        int ans=solve(arr,0,n,0,dp);
        return ans;
    }
}