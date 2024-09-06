class Solution {
    public String longestPalindrome(String s) {
        int n= s.length();
        int len=0;
        int max=Integer.MIN_VALUE;
        String ans="";
        boolean dp[][]= new boolean[n][n];
        for(int g=0;g<n;g++){
            for(int i=0,j=g;j<n;i++,j++){
                //1 case fort single element
                if(g==0){
                    dp[i][j]=true;
                    len=1;
                }
                //case for 2 length element
                else if(g==1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=true;
                        len=Math.max(len,s.substring(i,j+1).length());

                    }

                }
                else{
                    //case for more than two
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true){
                        dp[i][j]=true;
                        len=Math.max(len,s.substring(i,j+1).length());
                    }
                }
                if(dp[i][j]){
                    if(len>max){
                        max=len;
                        ans=s.substring(i,j+1);
                    }
                }
            }

        }
        return ans;
    }
}