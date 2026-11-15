import java.util.*;
class Solution {

    public static int solve(int i, int j, int m, int n, String s, String t, int dp[][]){

        if(j==n){
            return 1;
        }
        if(i==m){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int ways=solve(i+1,j,m,n,s,t,dp);
        if(s.charAt(i) == t.charAt(j)){
            ways+=solve(i+1,j+1,m,n,s,t,dp);
        }

        dp[i][j] = ways;
        return dp[i][j];
        
    }
    public int numDistinct(String s, String t) {
        

        int m = s.length();
        int n = t.length();

        int dp[][] = new int[m+1][n+1];
        for(int x[]: dp){
            Arrays.fill(x,-1);
        }

        int ans = solve(0,0,m,n,s,t,dp);
        return ans;
    }

}