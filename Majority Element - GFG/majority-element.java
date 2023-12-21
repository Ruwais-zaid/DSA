//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution

{
    public static int duplicate(int a[],int val){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==val){
                count++;
            }
        }
        if(count>a.length/2){
            return val;
        }
        else{
            return -1;
        }
    }
    static int majorityElement(int a[], int size)
    {
        // your code here
        //use MOORE VOTING ALGO
        int val=a[0];
        if(a.length==1){
            return val;
            
        }
        int count=1;
        for(int i=1;i<size;i++){
            if(a[i]==val){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                val=a[i];
                count=1;
            }
        }
        int ans=duplicate(a,val);
        return ans;
    }
}