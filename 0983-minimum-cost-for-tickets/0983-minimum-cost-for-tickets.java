class Solution {
     public static int solve(int[] days, int[] costs, int index,int[] dp) {
        // Base case
        if (index >= days.length) {
            return 0;
        }
        //dp base case
        if(dp[index]!=-1){
            return dp[index];
        }

        // 1 day pass
        int option1 = costs[0] + solve(days, costs, index + 1,dp);

        // 7 days pass
        int nextIndex = index;
        while (nextIndex < days.length && days[nextIndex] < days[index] + 7) {
            nextIndex++;
        }
        int option2 = costs[1] + solve(days, costs, nextIndex,dp);

        // 30 days pass
        nextIndex = index;
        while (nextIndex < days.length && days[nextIndex] < days[index] + 30) {
            nextIndex++;
        }
        int option3 = costs[2] + solve(days, costs, nextIndex,dp);

        dp[index]= Math.min(option1, Math.min(option2, option3));
        return dp[index];
    }

    public int mincostTickets(int[] days, int[] costs) {
        int n=days.length;
         int [] dp=new int [n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return solve(days,costs,0,dp);
        
    }
}