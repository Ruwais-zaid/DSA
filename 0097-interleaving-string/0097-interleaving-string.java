class Solution {

     public static boolean solve(int i, int j, String s1, String s2, String s3, Boolean[][] dp) {
        if (i == s1.length() && j == s2.length()) {
            return true;
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        int k = i + j;
        boolean possible = false;

        if (i < s1.length() && s1.charAt(i) == s3.charAt(k)) {
            possible = solve(i + 1, j, s1, s2, s3, dp);
        }
        if (!possible && j < s2.length() && s2.charAt(j) == s3.charAt(k)) {
            possible = solve(i, j + 1, s1, s2, s3, dp);
        }

        dp[i][j] = possible;
        return possible;
    }

    public boolean isInterleave(String s1, String s2, String s3) {

      int m = s1.length();
      int n = s2.length();
      if(s3.length()!=m+n){
        return false;
      }

      Boolean dp[][] =  new Boolean[m+1][n+1];

      return solve(0,0,s1,s2,s3,dp);
        
    }
}