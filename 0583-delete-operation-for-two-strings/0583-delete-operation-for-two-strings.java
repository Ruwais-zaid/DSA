class Solution {
    public static int solve(char ch1[],char ch2[],int i,int j,int dp[][]){
        if(i==ch1.length){
            return ch2.length-j;
        }
        if(j==ch2.length){
            return ch1.length-i;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(ch1[i]==ch2[j]){
            return solve(ch1,ch2,i+1,j+1,dp);
        }
        

        int delete1=1+solve(ch1,ch2,i+1,j,dp);
        int delete2=1+solve(ch1,ch2,i,j+1,dp);
        dp[i][j]=Math.min(delete1,delete2);
        return dp[i][j];
    }
    public int minDistance(String word1, String word2) {
        int n= Math.max(word1.length(),word2.length());
        
        char[] ch1 = word1.toCharArray();
        char[] ch2 =word2.toCharArray();
        int dp[][]= new int [n+1][n+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        int ans = solve(ch1, ch2, 0, 0,dp);
        return ans;
        
    }
}