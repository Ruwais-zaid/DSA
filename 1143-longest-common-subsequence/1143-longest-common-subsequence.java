class Solution {
    
    public static  int solve(char str[],char str1[],int i,int j,int dp[][]){
        if(i==str.length || j==str1.length){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(str[i]==str1[j]){
            return 1+solve(str,str1,i+1,j+1,dp);
        }
        else{
            dp[i][j]= Math.max(solve(str,str1,i,j+1,dp),solve(str,str1,i+1,j,dp));

        }
        return dp[i][j];

    }
    public int longestCommonSubsequence(String text1, String text2) {
         char str[]= text1.toCharArray();
        char str1[] = text2.toCharArray();
        int dp[][]= new int[str.length+1][str1.length+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        int ans = solve(str,str1,0,0,dp);
        return ans;
        
    }
}