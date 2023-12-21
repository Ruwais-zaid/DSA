//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int rep=-1;
        int mis=-1;
        int arr1[]=new int[n+1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=0;
        }
        for(int i=0;i<arr.length;i++){
            arr1[arr[i]]+=1;
        }
        for(int i=1;i<arr1.length;i++){
            if(arr1[i]==0){
                mis=i;
            }
            if(arr1[i]>1){
                rep=i;

            }

        }
        int next[]=new int[]{rep,mis};
        return next;
        
    }
}