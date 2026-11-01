class Solution {
    public int longestValidParentheses(String s) {
        
        int n = s.length();
        int dp[] =  new int[n+1];
        Stack<Integer> stk =  new Stack<>();
        int longest = 0;
        for(int i=0;i<n;i++){

            char ch = s.charAt(i);
            if( ch == '('){
                stk.push(i);
            }
            else {
                if (!stk.isEmpty()) {
                     
                     int openIndex = stk.pop();
                     int prevIndex = openIndex - 1;
                     dp[i] = i - openIndex + 1;
                     if(prevIndex>=0){
                          dp[i] += dp[prevIndex];
                     }
                     longest  = Math.max(longest,dp[i]);
                }
            }
        }
        return longest;
    }
}