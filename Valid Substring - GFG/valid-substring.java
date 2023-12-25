//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.findMaxLen(S));
        }
    }
}


// } Driver Code Ends


//User function Template for Java
class Solution {
    static int findMaxLen(String S) {
        // code here
        Stack<Character> stk=new Stack<>();
        int max=Integer.MIN_VALUE;
        int left=0;
        int right=0;
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if (ch == '(') {
                left++;
            }
            else{
                right++;
            }
            if(left==right){
                max=Math.max(max,2*right);
            }
            else if(right>left){
                left=0;
                right=0;
            }
        }
        left=right=0;
        for (int i = S.length() - 1; i >= 0; i--) {
 
            // If "(" is encountered, then
            // left counter is incremented
            // else right counter is incremented
            if (S.charAt(i) == '(')
                left++;
            else
                right++;
 
            // Whenever left is equal to right,
            // it signifies that the subsequence
            // is valid and
            if (left == right)
                max = Math.max(max, 
                                     2 * left);
 
            // Resetting the counters when the
            // subsequence becomes invalid
            else if (left > right)
                left = right = 0;
        }
        if(max==Integer.MIN_VALUE){
            return 0;
        }
        else{
            return max;
        }
        }
};