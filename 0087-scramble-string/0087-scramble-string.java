class Solution {

    public static boolean solve(String s1, String s2, int i, int j, int len,
                                Boolean[][][] dp) {
        if (dp[i][j][len] != null) {
            return dp[i][j][len];
        }

        if (s1.regionMatches(i, s2, j, len)) {
            dp[i][j][len] = true;
            return true;
        }

        for (int split = 1; split < len; split++) {
            boolean sameOrder = solve(s1, s2, i, j, split, dp)
                    && solve(s1, s2, i + split, j + split, len - split, dp);

            boolean swapped = solve(s1, s2, i, j + len - split, split, dp)
                    && solve(s1, s2, i + split, j, len - split, dp);

            if (sameOrder || swapped) {
                dp[i][j][len] = true;
                return true;
            }
        }

        dp[i][j][len] = false;
        return false;
    }
    public boolean isScramble(String s1, String s2) {
        

        int len1 = s1.length();
        int len2 = s2.length();
        if(len1 != len2){
            return false;
        }
        int n = len1;

        Boolean dp[][][] =  new Boolean[n][n][n+1];
        return solve(s1,s2,0,0,n,dp);
    }
}